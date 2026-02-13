<div align="center">

# 🏙️ ListyCity

### A Java Android Application for Managing Cities

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)](https://developer.android.com/studio)
[![JUnit5](https://img.shields.io/badge/Testing-JUnit%205-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge)]()
[![Tests](https://img.shields.io/badge/Tests-7%2F7%20Passed-brightgreen?style=for-the-badge)]()

---

*Built as part of Lab 6 — Javadoc & Unit Testing*

</div>

---

## 👤 Author

| Field | Details |
|-------|---------|
| **Name** | Ibrahim |
| **CCID** | ibrahi10 |

---

## 📖 About

**ListyCity** is an Android application that demonstrates core software engineering practices including **Javadoc documentation** and **JUnit 5 unit testing**. The app manages a collection of `City` objects, each with a city name and province, supporting operations like adding, deleting, searching, counting, and retrieving a sorted list of cities.

---

## 🏗️ Project Structure

```
ListyCity/
├── app/
│   ├── javadocs/                          # Generated Javadoc HTML documentation
│   ├── src/
│   │   ├── main/java/com/example/listycity/
│   │   │   ├── City.java                  # City model class (Comparable)
│   │   │   ├── CityList.java              # City list manager class
│   │   │   └── MainActivity.java          # Main Android activity
│   │   └── test/java/com/example/listycity/
│   │       └── CityListTest.java          # JUnit 5 unit tests
│   └── build.gradle.kts                   # Module-level Gradle config
├── build.gradle.kts                       # Project-level Gradle config
└── README.md
```

---

## ✨ Features

### 🔹 City Class
> A model class representing a city with name and province, implementing `Comparable` for sorting and overriding `equals()` & `hashCode()` for proper object comparison.

### 🔹 CityList Class
> A manager class that maintains a list of cities with the following operations:

| Method | Description |
|--------|-------------|
| `add(City city)` | Adds a city to the list. Throws `IllegalArgumentException` if duplicate. |
| `getCities()` | Returns a sorted list of all cities (alphabetical by name). |
| `hasCity(City city)` | Returns whether a given city exists in the list. |
| `delete(City city)` | Removes a city from the list. Throws `IllegalArgumentException` if not found. |
| `countCities()` | Returns the total number of cities in the list. |

---

## 🧪 Unit Tests

All tests written using **JUnit 5 (Jupiter)** — **7/7 passing** ✅

| Test | What It Verifies |
|------|-----------------|
| `testAdd()` | Adding a city increases list size and city is contained |
| `testAddException()` | Adding a duplicate throws `IllegalArgumentException` |
| `testGetCities()` | Cities are returned in sorted alphabetical order |
| `testHasCity()` | Returns `true` for existing city, `false` for non-existing |
| `testDelete()` | Deleting a city removes it and decreases count |
| `testDeleteException()` | Deleting a non-existing city throws `IllegalArgumentException` |
| `testCountCities()` | Count is accurate after adding and deleting cities |

---

## 📚 Javadoc

Full Javadoc documentation has been generated for all classes and methods, located in:

```
app/javadocs/
```

### Tags Used:
- `@author` — Author of the class
- `@version` — Version of the class
- `@param` — Method parameter descriptions
- `@return` — Return value descriptions
- `@throws` — Exception descriptions

---

## 🛠️ Tech Stack

| Technology | Purpose |
|-----------|---------|
| **Java** | Programming Language |
| **Android Studio** | IDE |
| **JUnit 5** | Unit Testing Framework |
| **Javadoc** | Code Documentation |
| **Gradle (Kotlin DSL)** | Build System |

---

## 🚀 Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/ibrahimosman786/ListyCity.git
   ```

2. Open in **Android Studio**

3. Let Gradle sync complete

4. Run unit tests:
   - Navigate to `app/src/test/java/com/example/listycity/`
   - Right-click `CityListTest` → **Run**

---

## 📝 License

This project was created for educational purposes as part of a university lab assignment.

---

<div align="center">

**Made with ☕ and 💻 by Ibrahim**

</div>
