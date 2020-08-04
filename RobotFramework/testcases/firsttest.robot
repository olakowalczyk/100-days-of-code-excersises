*** Variables ***

${BASEURL} =  https://the-internet.herokuapp.com
${BROWSER} =  chrome 

*** Settings ***
Library  SeleniumLibrary

Test Setup  Open TheInternetPage
Test Teardown  Close Browser 


*** Keywords ***

Open TheInternetPage
    Open Browser    ${BASEURL}   ${BROWSER}
  

*** Test Cases ***
Unsuccessful Login. Password not given
    Click Link                    link:Form Authentication  
    Input Text                    id:username    tomsmith
    Click Button                  xpath://*[@id="login"]/button
    Element Should Contain        id:flash    Your password is invalid!

Unsuccessful Login. Username not given
    Click Link                    link:Form Authentication  
    Input Text                    id:password    SuperSecretPassword!
    Click Button                  xpath://*[@id="login"]/button
    Element Should Contain        id:flash    Your username is invalid!

Successful Login
    Click Link                    link:Form Authentication  
    Input Text                    id:username    tomsmith
    Input Text                    id:password    SuperSecretPassword!
    Click Button                  xpath://*[@id="login"]/button
    Element Should Contain        id:flash    You logged into a secure area!

Logout
    Click Link                    link:Form Authentication  
    Input Text                    id:username    tomsmith
    Input Text                    id:password    SuperSecretPassword!
    Click Button                  xpath://*[@id="login"]/button
    Click Element                 xpath://*[@id="content"]/div/a/i
    Element Should Contain        id:flash  You logged out of the secure area!


