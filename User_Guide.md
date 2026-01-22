# How to Use the Console Application: Employee Net Pay Calculator

## Introduction
Welcome to the Employee Net Pay Calculator! This is a simple console-based Java application designed for end-users like HR assistants, small business owners, or anyone who needs to quickly calculate an employee's net pay after taxes. The app takes basic inputs (hours worked, hourly wage, and tax rate) and outputs the gross pay, tax deduction, and final net pay in a clear, formatted way.

No programming knowledge is required to use this app—just follow the steps below. The application runs in your computer's command line (terminal or command prompt) and requires Java to be installed on your system.

### System Requirements
- **Operating System**: Windows, macOS, or Linux.
- **Java Version**: Java Runtime Environment (JRE) 8 or higher. (If you don't have Java, download it from [oracle.com/java](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew on macOS.)
- **Hardware**: Any standard computer with at least 512 MB RAM.
- **Files Needed**: The `NetPayCalculator.java` source file (if compiling yourself) or a compiled `.jar` file (for easier running).

If you're unsure about your Java installation, open your terminal/command prompt and type `java -version`. It should show a version number like "18" or higher.

## Step 1: Setting Up the Application
Before running the app, you need to obtain and prepare the files. This can be done in two ways: compiling from source (for developers) or running a pre-compiled JAR (easier for most users).

### 1.1 Downloading the Files
1. Go to the GitHub repository: [
2. Click the "Code" button and select "Download ZIP".
3. Extract the ZIP file to a folder on your computer (e.g., `C:\NetPayCalculator` on Windows or `~/NetPayCalculator` on macOS/Linux).

<!-- Placeholder for image: Add a screenshot of the GitHub download page here -->
![Downloading from GitHub](assets/download-zip-screenshot.png)

### 1.2 Installing Java (If Not Already Installed)
1. Visit the official Java download page: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/).
2. Select the version for your OS (e.g., JDK for developers or JRE for running only).
3. Follow the installer prompts.
4. Verify installation: Open a new terminal and type `java -version`.

<!-- Placeholder for image: Add a screenshot of the Java version check in terminal -->
![Java Version Check](assets/java-version-screenshot.png)

### 1.3 Compiling the Java Code (Optional - For Source Code Users)
If you have the `NetPayCalculator.java` file and want to compile it:
1. Open your terminal/command prompt.
2. Navigate to the folder containing `NetPayCalculator.java` (e.g., `cd C:\NetPayCalculator`).
3. Run: `javac NetPayCalculator.java`. This creates a `NetPayCalculator.class` file.
4. If errors occur, ensure Java is in your system's PATH (search online for "add Java to PATH" for your OS).

<!-- Placeholder for image: Add a screenshot of the compilation command in terminal -->
![Compiling Java Code](assets/javac-screenshot.png)

### 1.4 Using a Pre-Compiled JAR (Recommended for Simplicity)
If a `NetPayCalculator.jar` is provided in the repo:
1. Download or extract it to your folder.
2. No compilation needed—proceed to running.

## Step 2: Running the Application
Once set up, launching the app is straightforward.

### 2.1 Opening the Terminal/Command Prompt
- **Windows**: Search for "cmd" in the Start menu.
- **macOS**: Open Spotlight (Cmd + Space) and type "Terminal".
- **Linux**: Open your terminal app (e.g., Ctrl + Alt + T on Ubuntu).

<!-- Placeholder for image: Add a screenshot of opening the terminal on Windows/macOS -->
![Opening Terminal](assets/open-terminal-screenshot.png)

### 2.2 Navigating to the App Folder
1. In the terminal, use the `cd` command to change directories (e.g., `cd /path/to/NetPayCalculator`).
2. Type `dir` (Windows) or `ls` (macOS/Linux) to confirm files like `NetPayCalculator.class` or `.jar` are present.

### 2.3 Executing the App
- **From Compiled Class**: Run `java NetPayCalculator`.
- **From JAR**: Run `java -jar NetPayCalculator.jar`.

The app will start and prompt you for inputs.

<!-- Placeholder for image: Add a screenshot of the app starting in terminal -->
![Running the App](assets/run-app-screenshot.png)

## Step 3: Using the Application
The app guides you through inputs via prompts. Enter values accurately for correct results.

### 3.1 Entering Inputs
1. When prompted "Enter the number of hours worked: ", type a number (e.g., 40.5 for 40 hours and 30 minutes) and press Enter.
   - Tip: Use decimals for partial hours; avoid negative numbers.
2. Next, "Enter the hourly wage: ": Type the wage (e.g., 15.50) and press Enter.
3. Finally, "Enter the tax rate (as a decimal, e.g., 0.15 for 15%): ": Type the rate as a decimal (e.g., 0.20 for 20%) and press Enter.

<!-- Placeholder for image: Add a screenshot of the input prompts in terminal -->
![Entering Inputs](assets/input-prompts-screenshot.png)

### 3.2 Viewing Outputs
After inputs, the app displays:
- Gross Pay: Total earnings before taxes (e.g., $622.75).
- Tax Deduction: Amount deducted (e.g., $93.41).
- Final Net Pay: Take-home amount (e.g., $529.34).

Results are formatted with two decimal places and dollar signs for clarity.

<!-- Placeholder for image: Add a screenshot of the output display in terminal -->
![Viewing Outputs](assets/output-screenshot.png)

### 3.3 Running Multiple Calculations
The app runs once per launch. To calculate for another employee:
1. Close the terminal or press Ctrl + C to exit.
2. Re-run the app as in Step 2.3.

## Step 4: Example Walkthrough
Let's simulate a full run with sample data.

1. Run the app: `java NetPayCalculator`.
2. Enter hours: 40 (press Enter).
3. Enter wage: 10 (press Enter).
4. Enter tax rate: 0.15 (press Enter).
5. Output:
   - Gross Pay: $400.00
   - Tax Deduction: $60.00
   - Final Net Pay: $340.00

<!-- Placeholder for image: Add a full screenshot of the example run -->
![Example Walkthrough](assets/example-run-screenshot.png)

## Step 5: Troubleshooting Common Issues
If something goes wrong, try these fixes:

### 5.1 "Java not found" Error
- Ensure Java is installed and added to your PATH.
- Restart your terminal after installation.

### 5.2 Invalid Input Errors
- The app assumes numeric inputs. If you enter text (e.g., "forty"), it may crash with an error like "InputMismatchException".
- Solution: Re-run and enter numbers only. (Future versions may add validation.)

### 5.3 No Output or App Doesn't Start
- Check file names: Ensure it's `NetPayCalculator.java` or `.jar`.
- Verify directory: Use `ls` or `dir` to confirm location.
- Java Version Mismatch: Update to JDK 8+.

### 5.4 Other Errors
- Search the error message online (e.g., "Java [error] fix").
- Contact the developers via the GitHub repo's issues page.

<!-- Placeholder for image: Add a screenshot of a common error and fix -->
![Troubleshooting Example](assets/error-screenshot.png)

## Conclusion
That's it! This app makes net pay calculations quick and error-free. For advanced features or issues, refer to the [Technical Documentation](./TechnicalDocumentation.md) or the GitHub repo. If you have feedback, feel free to reach out.

This guide was last updated on ![GitHub last commit](https://img.shields.io/github/last-commit/yourusername/your-repo?label=&color=brightgreen&style=flat-square)