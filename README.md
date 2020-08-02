# EddieMote
EddieMote is an interactive learning platform – keeping students & teachers connected.  

“EddieMote” (education + remote) is a playful and interactive learning platform that keeps students and teachers connected.  We believe that staying connected and exploring new ways of teaching during Covid-19 is the key to a trustful learning environment from everywhere, at any time, as real as possible. 

[![License](https://img.shields.io/badge/License-Apache2-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Due to our brand strategy we changed the name from Educamote to EddieMote.


## Contents

1. [Demo video](#demo-video)
1. [The architecture](#the-architecture)
1. [Idea Proposal](#idea-proposal)
1. [Project roadmap](#project-roadmap)
1. [Getting started](#getting-started)
1. [Running the tests](#running-the-tests)
1. [Live demo](#live-demo)
1. [Clickable Prototype](#clickable-prototype)
1. [Contributing](#contributing)
1. [Versioning](#versioning)
1. [Authors](#authors)
1. [License](#license)
1. [Acknowledgments](#acknowledgments)

## EddieMote



## Demo video

[![Watch the video](https://github.com/palcts/Educamote/blob/master/Assets/ios/EddieMote_Thumbnail.jpg)](https://youtu.be/49-Cj9FYjCg)

### What's the problem?

Due to Covid-19 a new demand for a remote eduction solution came up. Students started missing their daily school routine, meeting up with their mates and learning about new topics. On the other side are schools and teachers: A tool that offers a playful and interactive learning environment was missing as well as a solution that makes it possible to connect to students from everywhere, at any time, as real as possible. Tracking personal progress of each student was is hard as well. We would like to tackle those challenges with our application EddieMote which is available as a mobile and desktop version. Both versions complement each other perfectly and leave no need unanswered – an all-in-one-solution that solves the chaos of having to many different platforms for different demands. 

“We need to bring learning to people instead of people to learning.” (Elliot Masie) The app is for students and teachers – therefore we identified two different problem statements. 
Challenge Students: Miss the daily school life and interaction with fellow students; Get distracted by too many app features; Need to be motivated. Challenge Teacher: Have no chance to reach each student from everywhere; Lack a tool to oversee the individual progress of each student.  


### How can technology help?

Schools and teachers can continue to engage with their students through virtual classrooms, and even create interactive spaces for classes. As parents face a new situation where they may need to homeschool their children, finding appropriate online resources is important as well.
EddieMote allows teachers to use the platform as an all-in-one solution. The app becomes a great companion who leaves no feature unanswered. Teachers can hold their lectures virtually, organise group tasks, keep track on personal progress of each student individually, give real time advices on grades and homework, etc. 

From a design perspective, EddieMote differentiates itself from its competitors as well. Our application uses an intuitive approach and a colour theme that is attractive to kids. The name integrates education and remote.

Right now we have used the following IBM Technologies: Watson Assistant, Text to Speech, Speech to Text, Android SDK and Cloud Services. But we have future plans as well! Our application will be complemented by Watson Discovery, IBM API Connect and optional Cloudant. Those different IBM Technologies make EddieMote stand out from the crowd as well.

### The idea

During our market research we compared similar platforms, their features and values delivered to students and teachers. The analysis showed that the platforms are missing the focus on collaboration, exchange and communication. The purpose of creating a real classroom atmosphere was missing. Therefore, our solution EddieMote focuses on a factor that is essential during times of Covid-19: Connection. The virtual classroom, breakout sessions for group work or the opportunity for teachers to leave advises and comments directly under a grade or homework enhance that trustful virtual learning environment. Our main purpose is to make EddieMote as real as possible, imitating an almost normal day at school.

## The architecture

![Video transcription/translation app](https://github.com/palcts/Educamote/blob/master/Assets/ios/architecture.png)

1. The user navigates to the site and clicks on "Chat icon". End user can either ask Eddie with Audio or Text as input format.
2. Watson Speech to Text processes the audio and extracts the text.
3. Watson Assistant responds back based on the Dialog response 
4. The response is delivered back in text form and converted to Audio using IBM Android SDK

## Idea Proposal

[Idea Proposal](https://github.com/palcts/Educamote/blob/master/Assets/ios/Idea_Digital_Warriors_long_version_presentation.pdf)


[![Idea Proposal](https://github.com/palcts/Educamote/blob/master/Assets/ios/IdeaProposal.png)](https://github.com/palcts/Educamote/blob/master/Assets/ios/Idea_Digital_Warriors_long_version_presentation.pdf)

## Project roadmap

![Roadmap](https://github.com/palcts/Educamote/blob/master/Assets/ios/MicrosoftTeams-image.png)

##  Live Demo

You can find a built in Debug APK [Android App](https://github.com/palcts/Educamote/blob/master/Assets/ios/AndroidApkv2.apk)

## Clickable Prototype

1. Mobile App [Clickable Prototype](https://damian185394.invisionapp.com/public/share/M61B6L35H7)
2. Desktop App [Clickable Prototype](https://damian185394.invisionapp.com/public/share/PZ1B1RYYT3)


## Getting started

This repository contains the Android App source code and the Image assets.

### Prerequisites

- You need Android Studio.
- Android SDK with 28 support libs.
- IBM Watson Assistant API Key and Credentials
- IBM Text to Speech Service API Key and Credential
- IBM Speech to Text Service API Key and Credential

### Installing

The config.xml file is available in your values folder
In the config.xml file, enter your WATSON ASSISTANT ID, API Key and URL

```bash
    <!--Watson Assistant service credentials-->
    <!-- REPLACE `ASSISTANT_ID_HERE` with ID of the Assistant to use  -->
    <string name="assistant_id">ASSISTANT_ID_HERE</string>

    <!-- REPLACE `ASSISTANT_API_KEY_HERE` with Watson Assistant service API Key-->
    <string name="assistant_apikey">ASSISTANT_API_KEY_HERE</string>

    <!-- The URL provided below is for a given region/location -->
    <!-- If the Assistant service is created in another region/lpcation -->
    <!-- REPLACE the URL with the one provided in the credentials of the service you created-->
    <string name="assistant_url">URL</string>
```
-------------------------------------------------------
update the Watson Speech To Text(STT) API Key and URL

```bash
    <!--Watson Speech To Text(STT) service credentials-->
    <!-- REPLACE `STT_API_KEY_HERE` with Watson Speech to Text service API Key-->
    <string name="STT_apikey">STT_API_KEY_HERE</string>

    <!-- The URL provided below is for DALLAS region/location -->
    <!-- If the STT service is created in another region/lpcation -->
    <!-- REPLACE the URL with STT URL provided in the service credentials -->
    <string name="STT_url">URL</string>
```
-------------------------------------------------------

update the Watson Text To Speech(TTS) API Key and URL
```bash
    <!--Watson Text To Speech(TTS) service credentials-->
    <!-- REPLACE `TTS_API_KEY_HERE` with Watson Text to Speech service API Key-->
    <string name="TTS_apikey">TTS_API_KEY_HERE</string>

    <!-- The URL provided below is for DALLAS region/location -->
    <!-- If the TTS service is created in another region/lpcation -->
    <!-- REPLACE the URL with TTS URL provided in the service credentials -->
    <string name="TTS_url">URL</string>
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Espresso based UI Test automation is used in this Project.

### How to run the UI tests

`Espresso` based tests. Run the MainActivityTest to test the Watson Assistant end to end. Test will input sample texts and tests the Response dialog flows and sub responses.

Watch the Video of UI captured during the test.  [Video Link](https://github.com/palcts/Educamote/blob/master/Assets/ios/EspressoTestsFinalCut.mov) 

Either you could run the below command or run the tests using Android Studio IDE.
```bash
$ adb shell am instrument -w -r    -e debug false -e class 'com.educamote.eddiemote.MainActivityTest' com.educamote.eddiemote.test/android.support.test.runner.AndroidJUnitRunner
```

UI Tests console logs. 

```bash

Testing started at 13:53 ...

08/02 13:53:45: Launching 'MainActivityTest' on Samsung-abc.
Running tests

$ adb shell am instrument -w -r    -e debug false -e class 'com.educamote.eddiemote.MainActivityTest' com.educamote.eddiemote.test/android.support.test.runner.AndroidJUnitRunner

Started running tests

Connected to process 31151 on device 'Samsung-abc'.
Tests ran to completion.
```


## Built with


* [IBM Watson Assistant](https://www.ibm.com/watson) - The AI based ChatBot and Encyclopedia using Watson Discovery.
* [Watson Android SDK](https://developer.ibm.com/technologies/mobile/tutorials/use-watson-android-sdk-in-android-studio) - Used to develope Android App faster and to interact with IBM services
* [Watson Speech to Text](https://www.ibm.com/cloud/watson-speech-to-text) - Used to convert App users Speech to Text
* [Watson Text to Speech](https://www.ibm.com/cloud/watson-text-to-speech) - Used to give audio response based on Watson Assistant and Discovery

Following are in progress for furture feature implementation,
* [IBM Cloudant](https://cloud.ibm.com/catalog?search=cloudant#search_results) - The NoSQL database would be used
* [IBM Cloud Functions](https://cloud.ibm.com/catalog?search=cloud%20functions#search_results) - The compute platform for handing logic
* [IBM API Connect](https://cloud.ibm.com/catalog?search=api%20connect#search_results) - The web framework used

## Contributing

Please feel free to contribute and submit pull requests.

## Versioning

We would use [SemVer](http://semver.org/) for versioning.

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/palcts/Educamote/graphs/contributors) who participated in this project.

## License

This project is licensed under the Apache 2 License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Based on [Billie Thompson's README template](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2).
