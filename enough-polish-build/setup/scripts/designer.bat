REM Start the editor for binary data files:
java -classpath "%{INSTALL_PATH}/lib/enough-j2mepolish-build-common.jar;%{INSTALL_PATH}/lib/enough-j2mepolish-app-designer.jar;$CLASSPATH" de.enough.polish.designer.StandaloneDesigner --polish.home "%{INSTALL_PATH}" %1 %2 %3