# ImageViewerApp
### Assignment 4 CIS 3515 - Philip Lapinski

## What it's about:
This assignment builds upon our previous **spinner assignment**. We can refactor what was done in the old assignment to create new a new featuring
using a secondary activity. This will require project coordination and will bring us in project packing and distribution. After implementing the new
features, we have to package our program and give it an icon - signalling it ready for distribution.

## The Requirements:
#### There are three main parts for this assignment:
1. Create a Spinner activity.
    - When selecting an item, launches second activity
2. Create a Secondary display activity
    - Displays image + description from primary activity
3. Create an icon to app
    - Should generate signed APK for distribution

## Notes:
Making an app distributable requires a certificate. There are detailed notes in the assignment on canvas that outline how to acquire a certificate
as well as common practice for app upkeep. **Reference canvas for section 2**.

# Examples:

Spinner Activity           |  Display Activity
:-------------------------:|:-------------------------:
![image](https://user-images.githubusercontent.com/41872747/109740010-81ed7380-7b98-11eb-998a-98ae4cf4b5e4.png)  |  ![image](https://user-images.githubusercontent.com/41872747/109740061-9df11500-7b98-11eb-9ea7-de0f7edc3a6d.png)



## Rubric:
Requirement          |  Value
:-------------------------:|:-------------------------:
Proper custom adapter and Spinner(displays various items for selection | 10%
Spinner shows different views for drop-down mode vs selected mode | 10%
App contains 2 activities that display unique titles (e.g. Selection and Display) | 10%
Application label in OS launcher is different from Main activity title | 10%
User choosing item from main activity launches second activity | 20%
When second activity launches both item description and image are shown | 10%
When DisplayActivity closes, spinner on main activity displays instruction again | 10%
App has custom icon for main activity | 10%
Generated and provided APK file | 10%
