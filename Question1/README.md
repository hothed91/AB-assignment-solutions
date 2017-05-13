Instructions on running
-----------------------------
**!!! Important: The following are the different options to running these files and have been locally tested if you have further questions please let me know**  

**This Question uses Java 8. So if you don't have it you can download it [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)**  

**Also these steps assume that you have either cloned the repo or downloaded the files as a zip somwhere on your system**  
1. **Intellij**
   1. File > New > Project from Existing Sources
   1. Select the 'Question 1' directory and click the 'OK' button
   1. Click on the radio button where it says 'Create project from existing sources then click 'Next'
   1. Project Name and Project Location should auto-fill based on step 2. so go ahead and Click 'Next'
   1. Click 'Next'
   1. Click 'Next'
   1. Click 'Next'
   1. Either Select existing project SDK 1.8 or add new project SDK
      1. To add new Project SDK click on the green plus sign
      1. Click 'JDK'
      1. Traverse the directory until you find where you downloaded/installed JDK 1.8 and click on the directory _i.e. jdk1.8.0_131_
      1. Then Click 'OK'
   1. Click 'Next'
   1. Click 'Finish'
   1. From there you should be able to open the Main.java file and run it. (Run > Run...) 
2. **Eclipse** (This was tested on Eclipse Mars)
   1. File > New> Java Project
   1. Project Name: Question1 (or whatever you see fit)
   1. Make sure JRE is using JavaSE-1.8
   1. Click 'Finish'
   1. On your OS file explorer select the src folder and log-file.log file and drag it onto 'Question1' Project in Eclipse
   1. Click 'OK'
   1. Open Main.java and run it (either the green play button on the top or Run > Run)
3. **Command Line** - Below I'll link to general instruction to running via command line. Also this is assuming you are familiar with your chose of command line
   1. [Mac OS X](http://introcs.cs.princeton.edu/java/mac/)
   2. [Windows](http://introcs.cs.princeton.edu/java/windows/)
   3. [Linux](http://introcs.cs.princeton.edu/java/linux/)
   4. So following the general instructions above open your command line to the Question1 folder
   5. Run the following command `javac src/net/kathleensebree/*.java`
   6. Once that command runs successfully run this next command `java -cp ./src net.kathleensebree.Main`
