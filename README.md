# ImageViewerApp
### Assignment 4 CIS 3515 - Philip Lapinski

## What it's about:
This assignment builds upon our previous **spinner assignment**. We can refactor what was done in the old assignment to create new a new featuring
using a secondary activity. This will require project coordination and will bring us in project packing and distribution. After implementing the new
features, we have to package our program and give it an icon - signalling it ready for distribution.

**UPDATE!!!**
We are going to be refactoring what we previously did with the Spinner. We'll be replacing our **Spinner** with a **GridView**. We'll also put
a label on the top of the selection window to guide our user with some directions. See the requirements below to see the full specifications.

## The Requirements:
1. Create a GridView.
    - When selecting an item, launches second activity
    - Should have background image for each galaxy
    - Should center text over child view
2. Create a Secondary display activity
    - Displays image + description from primary activity
3. Create an icon to app
    - Should generate signed APK for distribution - app.release.1.0.1

## Notes:
Making an app distributable requires a certificate. There are detailed notes in the assignment on canvas that outline how to acquire a certificate
as well as common practice for app upkeep. **Reference canvas for section 2**.

# Examples:

Selection Activity           |  Display Activity
:-------------------------:|:-------------------------:
![image](https://user-images.githubusercontent.com/41872747/110686688-b15e3a80-81ad-11eb-9956-ecf0e4bc1682.png) | ![image](https://user-images.githubusercontent.com/41872747/110687012-0a2dd300-81ae-11eb-98d8-494ca3abbd8b.png)




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

**ADDITIONAL REQUIREMENTS**
Requirement          |  Value
:-------------------------:|:-------------------------:
Application based on git branch of previous lab | 20%
Application uses GridView instead of Spinner | 40%
Custom adapter generates views containing image with text superimposed and centered | 40%
