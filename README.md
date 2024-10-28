# RichardLab21G01-Project2



## Tests

To run the test of the application, run the command `gradle test`in the terminal. Our CI/CD implementation renders a automated test reports which you can find at:
1. `app\build\reports\jacoco\test\html\index.html` for jacoco report.
2. `app/build/reports/tests/test/index.html` for JUnit report.


### Jenkins implementation
 

#### Running ngrok persistently (on Windows)
You can set up ngrok to automatically by setting-up ngrok as a windows service:

1. Install ngrok into your computer.
2. Sign up with an account to ngrok and obtain your authetication token and a free domain.
3. Open the terminal and head to your ngrok installation path `ngrok config add-authtoken <TOKEN>`
4. Obtain the path to your ngrok configuration path with `ngrok config check` and replace it with the `ngrok.taml` template in the resource folder by introducing your auth-token and domain. 
5. Open Window's cmd prompt with administrator settings. Then, go to your `ngrok.exe` installation path and run `ngrok service install --config <path to ngrok.yml>`
6. To start the server, run `ngrok service start`. You won't need to do this again after restarting your PC. 

If you have ngrok set-up, you can check its status in http://127.0.0.1:4040/status.
