*** Settings ***
Library  OperatingSystem
Library  Collections

*** Variables ***
${value1}=  4
${value2}=  5

@{list}=  robot  framework

&{dictionary}=  name=Ola  surname=Kowalczyk

#%{USERNAME}


*** Test Cases ***
Scalar Variables
    Log To Console  \n${value1} and ${value2}
    ${value3}=  Evaluate  ${value1} + ${value2}
    Log To Console  ${value3} 

List Variables
    Log To Console  \n${list}[0]

Dictionary Variables
    Log To Console  \n${dictionary}[name]
    Log To Console  \n${dictionary.surname}

#Environmental Variables
    #Log To Console  \n%{USERNAME}

Return value variable
    ${x}=  Get value
    Log To Console  \n${x}

Buildin Variables
    Log To Console  \n${CURDIR}

Boolean/None Variable
    Log To Console  \n${False}
    Log To Console  \n${None}

Automatic Variables
    Log To Console  \n${TESTNAME}
    Log To Console  ${LOGFILE}
    


*** Keywords ***
Get value
    [Return]  1500100900




