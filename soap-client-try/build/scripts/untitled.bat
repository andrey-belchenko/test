@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  untitled startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and UNTITLED_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\untitled-1.0-SNAPSHOT.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.6.20.jar;%APP_HOME%\lib\rt-4.0.0.jar;%APP_HOME%\lib\jakarta.xml.ws-api-4.0.0.jar;%APP_HOME%\lib\policy-4.0.0.jar;%APP_HOME%\lib\jaxb-runtime-4.0.0.jar;%APP_HOME%\lib\jaxb-core-4.0.0.jar;%APP_HOME%\lib\jakarta.xml.bind-api-4.0.0.jar;%APP_HOME%\lib\jakarta.jws-api-3.0.0.jar;%APP_HOME%\lib\osgi-resource-locator-2.5.0-b42.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.6.20.jar;%APP_HOME%\lib\kotlin-stdlib-1.6.20.jar;%APP_HOME%\lib\saaj-impl-3.0.0.jar;%APP_HOME%\lib\jakarta.xml.soap-api-3.0.0.jar;%APP_HOME%\lib\streambuffer-2.1.0.jar;%APP_HOME%\lib\stax-ex-2.1.0.jar;%APP_HOME%\lib\angus-mail-1.0.0.jar;%APP_HOME%\lib\jakarta.mail-api-2.1.0.jar;%APP_HOME%\lib\angus-activation-1.0.0.jar;%APP_HOME%\lib\jakarta.activation-api-2.1.0.jar;%APP_HOME%\lib\ha-api-3.1.13.jar;%APP_HOME%\lib\gmbal-api-only-4.0.3.jar;%APP_HOME%\lib\management-api-3.2.3.jar;%APP_HOME%\lib\mimepull-1.10.0.jar;%APP_HOME%\lib\woodstox-core-6.2.8.jar;%APP_HOME%\lib\stax2-api-4.2.1.jar;%APP_HOME%\lib\jakarta.annotation-api-2.1.1.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.6.20.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\txw2-4.0.0.jar;%APP_HOME%\lib\istack-commons-runtime-4.1.1.jar


@rem Execute untitled
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %UNTITLED_OPTS%  -classpath "%CLASSPATH%" MainKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable UNTITLED_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%UNTITLED_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
