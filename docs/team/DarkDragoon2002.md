# Project Portfolio Page - DarkDragoon2002

## Overview
HealthMate is a meal and calorie tracking application designed to help users manage their dietary intake, monitor their weight, and track their overall health goals. The app enables users to log meals, track calories, and observe their progress towards a healthier lifestyle.

## Summary of Contributions

### Code Contributed
[Link to code contributions](https://nus-cs2113-ay2425s1.github.io/tp-dashboard/?search=darkdragoon2002&breakdown=true)

### Enhancements Implemented

1. **Implemented `HealthGoal` Class**
    - Implemented `HealthGoal` Class allowing the `User` Class to save the health goal of the user
    - Implemented Target Calories Calculation, depending on data such as height, weight, age, gender and health goal
    - Created a Function to update it
    - Created a Command that can be called by the user but has since been integrated into update user command

2. **Implemented Deletion of `Meal` & `MealEntry`**
    - Implemented Deletion of Meal & MealEntry Commands and Functions
    - Integrated both into the `ChatParser` Class as well

3. **Implemented `DateTimeUtils` Class**
    - Implemented `DateTimeUtils` Class in order to allow for easier and more compact use of `LocalDateTime` and `LocalDate` packages
    - Used in the implementation of `show todayCalories` & `show historic Calories {No. of Days}` commands

4. **Implemented `todayCalories` & `historicCalories` Commands and Methods**
    - Implemented `todayCalories` & `historicCalories` methods and Commands
    - Used `kennethSty`'s `ConsumptionBars` Code to print out consumption bars for the various days
    - Used `DateTimeUtils` to better get the date and times necessary
    - Implemented the statistics and necessary code that was used by `historicCalories` which was then abstracted out by `kennethSty` into the `ConsumptionStatistics` Class

### Contributions to the User Guide
* Added entries for the following commands:
    - Delete meal from meal menu
    - Delete meal from meal log
    - Show Calorie Progress for Today
    - Show Historic Calorie Progress
* Added Entering App section in Quick Start Guide

### Contributions to the Developer Guide
* Added HealthGoal and various references to it
* Add Step in Manual Testing to show HistoricCaloricTrend
* Created setHealthGoalSD although not used in DG

### Contributions to Team Tasks
* Set up the Repo
* Set up various permissions, tags, roles and rules in the repo
* Contributed to creation of issues
* Fixed IO Testing issues

### Review/Mentoring Contributions
* Reviewed and approved multiple PRs
* Helped troubleshoot integration issues between different components