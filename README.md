# Report Generator

## Overview

This project is a **Report Generator** built in Java to help a company generate different types of reports. It follows **OOP** and **OOD** principles and uses **Singleton**, **Factory Method**, and **Facade** design patterns. The application is extensible, allowing for new report types, and features a **command-line interface (CLI)**. No databases or GUIs are used.

## Features

- **Generate various reports**: General, Pay, and Year-to-Experience.
- **Extensible design** for adding new report types.
- **Command-line interface** for user interaction.

### Design Patterns

- **Singleton**: Ensures a single instance of `ReportSetting`.
- **Factory Method**: Creates different report types (e.g., `PayReportBuilder`).
- **Facade**: Simplifies report generation through `ReportFund`.

## Key Classes

- **ReportFund**: Manages report generation.
- **ReportSetting**: Handles report configuration (Singleton).
- **PayReportBuilder**: Creates pay-related reports.
- **Employee**: Represents employee data (name, job title, salary, etc.).
- **GeneralReport**: Abstract base class for reports.
- **YearToExperienceReportBuilder**: Creates reports based on employee experience.
- **MainApp**: Handles user input and coordinates report generation.

## OOP & OOD Concepts

- **Encapsulation**: Data and behavior are encapsulated within classes.
- **Inheritance**: Abstract classes like `GeneralReport` define common behavior.
- **Polymorphism**: Different report types are generated using the same interface.
- **Abstraction**: Complex logic is hidden behind simple interfaces.

## How to Run

1. **Clone the repository**:

    ```bash
    git clone <repository-url>
    ```

2. **Navigate to the project directory**:

    ```bash
    cd report-generator
    ```

3. **Compile and run**:

    ```bash
    javac *.java
    java MainApp
    ```

4. **Follow CLI prompts to generate reports.**

## Extending the Application

To add a new report type:

1. **Create a class extending `GeneralReport`.**
2. **Implement report generation logic.**
3. **Update `MainApp` to include the new report type.**

## Conclusion

This project demonstrates **OOP**, **OOD**, and design patterns to create a flexible, extensible report generation system. The CLI provides a simple way to generate reports without a GUI or database.
