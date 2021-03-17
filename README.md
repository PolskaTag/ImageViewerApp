# ImageViewerApp
### Assignment 6 CIS 3515 - Philip Lapinski

## What it's about:
This assignment builds upon our previous **spinner assignment**. We can refactor what was done in the old assignment to create new a new featuring
using a secondary activity. This will require project coordination and will bring us in project packing and distribution. After implementing the new
features, we have to package our program and give it an icon - signalling it ready for distribution.

**UPDATE!!!**
We are going to be refactoring what we previously did with the Spinner. We'll be replacing our **Spinner** with a **GridView**. We'll also put
a label on the top of the selection window to guide our user with some directions. See the requirements below to see the full specifications.

**FRENCH UPDATE**  
Our gridview is look somewhat good - lets get some more diversity in the house! For this assignment we want to add French Translations.
When a user's device is configured to French Local, the app should display French and ONLY French. To do this, we need to move all hardcoded
string values over to our string resources. Once moved, we can begin to refactor our activities to look for those strings inside our resources.

## The Requirements:

### Prereqs
1. [x] Create a GridView.
    - When selecting an item, launches second activity
    - Should have background image for each galaxy
    - Should center text over child view
2. [x] Create a Secondary display activity
    - Displays image + description from primary activity
3. [x] Create an icon to app
    - Should generate signed APK for distribution - app.release.1.0.1

### The New Stuff
1. [x] Move hardcoded strings to strings resources
    - This include string arrays. Each item in the string array should be a string resource value.
3. [x] Refactor activities and adapter to reflect changes
4. [x] Added language translation to existing string resources



## Notes:
Making an app distributable requires a certificate. There are detailed notes in the assignment on canvas that outline how to acquire a certificate
as well as common practice for app upkeep. **Reference canvas for section 2**.

# Examples:

Selection Activity           |  Display Activity
:-------------------------:|:-------------------------:
![image](https://user-images.githubusercontent.com/41872747/110686688-b15e3a80-81ad-11eb-9956-ecf0e4bc1682.png) | ![image](https://user-images.githubusercontent.com/41872747/110687012-0a2dd300-81ae-11eb-98d8-494ca3abbd8b.png)
![image](https://user-images.githubusercontent.com/41872747/111509081-be85a700-8722-11eb-9ae1-cb59aabc20ca.png) | ![image](https://user-images.githubusercontent.com/41872747/111509127-cba29600-8722-11eb-83ad-f31e76427066.png)


## Rubric:

Requirement          |  Value
:-------------------------:|:-------------------------:
Application based on git branch of previous lab | 10%
Resources are used for all string values instead of hard-coded strings | 20%
Resources are used for String arrays instead of hard-coded values | 30%
App is localized for French when device language is changed | 40%

