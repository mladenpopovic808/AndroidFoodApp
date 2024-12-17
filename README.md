# Nutrition Tracker Application

## Project Description
The **Nutrition Tracker** is a mobile application designed to help users **search, save, and monitor meals** while creating personalized diet plans. The app focuses on intuitive navigation, Material Design principles, and seamless user experience. Key functionalities include advanced filtering, calorie tracking, and meal plan management.

---

## Features

### 1. Splash Screen and Login Screen
- **Splash Screen**: Checks if the user is already logged in and redirects to the Main Screen; otherwise, it navigates to the Login Screen.
- **Login Screen**:
  - Input fields for username and password.
  - Password validation: Minimum 4 characters.

---

### 2. Main Screen
- Displays a **list of categories** (with images and titles).
- Clicking a category shows meals within that category.
- **Dialog option**: Each category includes a description accessible via an icon.
- **Search Functionality**: Search meals or ingredients without selecting a category.

---

### 3. Filter Screen
- Allows filtering meals based on:
  - **Category**, **Region**, and **Ingredients** (using a tab menu).
- **Features**:
  - Sorting meals alphabetically.
  - Filtering by name and tags.
  - Pagination: Display meals in sets of 20.
  - Loading animation while retrieving API data.
- Clicking a meal navigates to the **Detailed Meal View**.

---

### 4. Meal List Screen
- Displays **meal names** and **images**.
- Pagination: Displays 10 meals per page.
- **Search Options**:
  - By meal name.
  - By ingredients.
- Additional **filter**: Filter meals based on calorie count (greater than, less than, or within a range).
- Each meal item includes its **calorie value**.

---

### 5. Detailed Meal View
- Displays complete meal details:
  - Name, category, region, instructions, image, tags, video link, and all ingredients (with measurements).
- **Save Meal Option**: Opens a new screen for meal scheduling.
- If certain API data (e.g., video link) is unavailable, it will display "Not Available."
- Includes **calorie value** for the meal.

---

### 6. Save Meal Functionality
- Allows users to:
  - Select a **date** for the meal (default is today).
  - Choose a meal category: Breakfast, Lunch, Snack, or Dinner.
  - Replace the meal image using the phone's camera (via implicit intent).
- **Persistent Storage**: Saved meals are stored locally using **Room Database**.
- **Saved Data**:
  - Name, image, preparation instructions, video link, ingredients, date, and meal category.
- Includes an option to **edit or delete saved meals**.

---

### 7. Calorie Tracking
- Calculates the **total calorie value** of meals based on ingredients (per 100g).
- Notifies the user if calorie data for all ingredients is not available.
- Allows saving and managing **calorie values for individual ingredients**.

---

### 8. Statistics Page
- Displays a **graph** showing the number of meals added per day for the last 7 days.
- Switchable to a **calorie-based graph**:
  - Daily calorie values are shown.
  - Red color indicates exceeding the user's daily calorie limit.
- Notifies users when calorie values are unavailable for specific meals.

---

### 9. Weekly Meal Plan
- Users can create a **weekly diet plan**:
  - Add meals either from the API or the local database.
  - Include calorie values for added meals.
- Email the created plan using an implicit intent.
  - Email body contains the list of meals with details and a link to open the app.

---

## Technical Details
- **API**:
  - [TheMealDB API](https://www.themealdb.com/api.php)
  - [Nutrition API](https://api-ninjas.com/api/nutrition)
- **Technologies**:
  - **ViewModel** and **LiveData** for UI state management.
  - **Room Database** for local storage.
  - **Retrofit** for API communication.
  - **Material Design** components for UI consistency.
- **Additional Functionalities**:
  - Date selection dialog: [DatePicker](https://developer.android.com/reference/android/widget/DatePicker)
  - Camera integration using implicit intent.

---

## Advanced Teamwork Features
- **Calorie Tracker**:
  - Calculate calorie intake based on user details (age, height, weight, gender, activity level).
  - Implemented using online calorie tracking APIs.
- Includes all functionalities for individual and team project requirements.

---

## Summary
The **Nutrition Tracker** app provides a comprehensive solution for meal management, calorie tracking, and personalized diet plans. With robust filtering, detailed meal views, and data persistence, users can effortlessly organize their meals and track nutrition goals.
