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

You can find a built in Debug APK [Android App](https://github.com/palcts/Educamote/blob/master/Assets/ios/v0%20app-debug%20.apk)

## Clickable Prototype

1. Mobile App [Clickable Prototype](https://damian185394.invisionapp.com/public/share/M61B6L35H7)
2. Desktop App [Clickable Prototype](https://damian185394.invisionapp.com/public/share/PZ1B1RYYT3)


## Getting started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```bash
dnf install wget
wget http://www.example.com/install.sh
bash install.sh
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be, for example

```bash
export TOKEN="fffd0923aa667c617a62f5A_fake_token754a2ad06cc9903543f1e85"
export EMAIL="jane@example.com"
dnf install npm
node samplefile.js
Server running at http://127.0.0.1:3000/
```

And repeat

```bash
curl localhost:3000
Thanks for looking at Code-and-Response!
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why, if you were using something like `mocha` for instance

```bash
npm install mocha --save-dev
vi test/test.js
./node_modules/mocha/bin/mocha
```

### And coding style tests

Explain what these tests test and why, if you chose `eslint` for example

```bash
npm install eslint --save-dev
npx eslint --init
npx eslint sample-file.js
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

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/palcts/Educamote/graphs/contributors) who participated in this project.

## License

This project is licensed under the Apache 2 License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* Based on [Billie Thompson's README template](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2).
