# ToastWeb [![Build Status](https://travis-ci.org/floogulinc/ToastWeb.svg?branch=master)](https://travis-ci.org/floogulinc/ToastWeb)
Web UI for [Toast](https://github.com/Open-RIO/ToastAPI)

![ToastWeb main screen screenshot](https://i.imgur.com/XxdjyMg.png)

## How to use
Set `modulename` in `toast/config/toastweb.conf` to the name of the `moduleconfig` you want to edit in the web UI. The UI will load the Toast `moduleconfig` with the file name of the name set in the config + `.conf`. Set `port` in the config to the port you want the web UI to be served on.

Example config:
```js
{
	"port":5802,
	"modulename":"ToastWeb"
}

```

## Development Setup
To set up this module in your development environment, follow these steps:

1. Clone the repository  
2. Run `gradlew eclipse` for eclipse, or `gradlew idea` for IntelliJ (linux/mac users should use `./gradlew` instead of `gradlew`.)  
3. Edit the `build.gradle` file to reflect your desired configuration (e.g. changing the Team Number)  

To build this module, simply run `gradlew build`.
To deploy this module to your Robot, simply run `gradlew deploy`.
If you haven't already, you can deploy [Toast](https://github.com/Open-RIO/ToastAPI) to your Robot by running `gradlew toastDeploy`.

## Screenshots

### Main Screen
![ToastWeb main screen screenshot](https://i.imgur.com/Cat1XJf.png)

### Configuration Screen
![ToastWeb configuration screen screenshot](https://i.imgur.com/LDE3KXa.png)
