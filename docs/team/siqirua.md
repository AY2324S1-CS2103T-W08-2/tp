---
  layout: default.md
  title: "Siqi's Project Portfolio Page"
---

### Project: ModuLight

ModuLight is a desktop student grades system application.
The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java, and has about 10 kLoC.

Given below are my contributions to the project.

* **New Feature**: `calculate statistics` - Added command to calculate the statistics.
    * What it does: Generates a statistics summary of the overall grades of all students or a selected tutorial group
      * Justification: As a professor or teaching assistant, our target users may be interested in the overall performance 
      of all students in terms of various statistical measures, such as max, min, quartile and standard deviation. This 
      command allows the user to easily view a summary of statistics with one single command. In addition, I also 
      implemented the command to calculate the statistics of a specific graded component instead of the overall score.

* **New Feature**: `sort students` - Added command to sort the students.
    * What it does: Sorts the students based on a given sorting order.
    * Justification: When the number of student grows, it will be hard for our users to find the top performing 
    students. Thus, we implement this command to allow our users to quickly identify the top students. In addition, this 
    command is also necessary to make the displayed data more neat.

* **New Feature**: `sort scores` - Added command to sort the student scores.
    * What it does: Sorts the students scores of a given graded component and display the associated students in the 
    corresponding order.
    * Justification: Similar to the previous feature, when the number of student scores grows, it will be hard for our 
    users to find the top performing students in one specific graded component. Thus, we implement this command to 
    allow our users to quickly identify the top scores. Meanwhile, the associated students will also be displayed in the
    corresponding order. In addition, this command is also necessary to make the displayed data more neat.

* **New Feature**: `find students` - Added command to search for students.
    * What it does: Searches the students satisfying the given criteria.
    * Justification: Similar to the previous features, when the number of student grows, it will be hard to find certain 
    students based on their names or student IDs. Thus, we implement this command to allow our users to find certain 
    students effectively.

* **New Feature**: `clear all` - Added command to clear all data.
    * What it does: Delete all the existing data.
    * Justification: This allows our user to effectively delete all data and use it to manage a new module.
  
* **Code contributed**:
    * Please refer to this [RepoSense Link](https://nus-cs2103-ay2324s1.github.io/tp-dashboard/?search=siqirua&breakdown=true)

  * **Project management**:
    * Release JAR file for V1.3 trial

* **Enhancements to existing features**:
    * Modify the student score related storage classes to suit our project.

* **Documentation**:
    * User Guide:
        * Added details for `findStu`, `sortStu`, `sortStuScore`, `stats`, `compStats`, `clearAll`
        * Added details for student parameters `st/`, `o/` and `r/`
    * Developer Guide:
        * Added target user profile, value proposition, use cases, non-functional requirements and glossary sections.

* **Community**:
  * Reported bugs and suggestions for team F10-3 during PE dry run.
