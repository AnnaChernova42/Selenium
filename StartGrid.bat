cmd /C start/MIN java -jar selenium-server-standalone-2.46.0.jar -role hub -port 4445 -timeout 300 -browserTimeout 360
cmd /C start/MIN java -jar selenium-server-standalone-2.46.0.jar -role node -port 5599 -hub http://localhost:4445/grid/register -nodeConfig NodeConfig.json -Dwebdriver.chrome.driver=Drivers\chromedriver.exe -Dwebdriver.ie.driver=Drivers\IEDriverServer.exe
