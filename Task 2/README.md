# Student Grade Calculator

A comprehensive console-based grade calculator program written in Java as part of CodeSoft internship program - Task 2.

## About The Program

This application helps students and teachers calculate grades based on marks obtained in multiple subjects. It provides detailed analysis including total marks, average percentage, grade assignment, and performance insights.

## Features

- **Multi-Subject Support**: Handle any number of subjects
- **Input Validation**: Ensures marks are between 0-100
- **Automatic Calculations**: 
  - Total marks calculation
  - Average percentage computation
  - Grade assignment based on performance
- **Detailed Reports**: Professional grade report with analysis
- **Performance Analysis**:
  - Best performing subject identification
  - Areas needing improvement
  - Pass/fail status for each subject
- **User-Friendly Interface**: Clear prompts and formatted output

## How To Use

1. **Run the program**
2. **Enter number of subjects** you want to calculate grades for
3. **Input subject details**:
   - Enter name of each subject
   - Enter marks obtained (0-100) for each subject
4. **View results**: Get comprehensive grade report with analysis

## Grade Scale

| Percentage Range | Grade | Remarks |
|-----------------|-------|---------|
| 90% - 100% | A+ | Outstanding Performance! |
| 80% - 89% | A | Excellent Performance! |
| 70% - 79% | B+ | Very Good Performance! |
| 60% - 69% | B | Good Performance! |
| 50% - 59% | C | Average Performance |
| 40% - 49% | D | Below Average - Need Improvement |
| Below 40% | F | Fail - Significant Improvement Required |

## Sample Output

```
=== Student Grade Calculator ===
Enter marks for each subject (out of 100)
How many subjects do you have? 5

Enter subject names and marks:
Subject 1 name: Mathematics
Enter marks for Mathematics (0-100): 85
Subject 2 name: Physics
Enter marks for Physics (0-100): 78
Subject 3 name: Chemistry
Enter marks for Chemistry (0-100): 92
Subject 4 name: English
Enter marks for English (0-100): 88
Subject 5 name: Computer Science
Enter marks for Computer Science (0-100): 95

========================================
         STUDENT GRADE REPORT
========================================

SUBJECT-WISE MARKS:
------------------------------
Mathematics         : 85.0/100
Physics             : 78.0/100
Chemistry           : 92.0/100
English             : 88.0/100
Computer Science    : 95.0/100

SUMMARY:
------------------------------
Total Subjects       : 5
Total Marks Obtained : 438.0 out of 500.0
Average Percentage   : 87.60%
Grade Achieved       : A
Remarks              : Excellent Performance!

PERFORMANCE ANALYSIS:
------------------------------
Best Performance     : Computer Science (95.0 marks)
Needs Attention      : Physics (78.0 marks)
Subjects Passed      : 5 out of 5
Status               : PASSED in all subjects! ✓
```

## Requirements

- **Java Version**: JDK 8 or higher
- **System**: Any operating system with Java support
- **Memory**: Minimal memory requirements
- **Dependencies**: None (uses only standard Java libraries)

## Installation & Setup

1. **Download/Clone**: Get the source code
   ```bash
   # If using git
   git clone [your-repository-url]
   ```

2. **Compile the program**:
   ```bash
   javac StudentGradeCalculator.java
   ```

3. **Run the program**:
   ```bash
   java StudentGradeCalculator
   ```

## Input Specifications

- **Number of Subjects**: Any positive integer
- **Subject Names**: Any text (avoid special characters for best display)
- **Marks**: Decimal numbers between 0.0 and 100.0
- **Validation**: Program automatically validates all inputs

## Technical Details

### Core Algorithms
- **Total Calculation**: Simple addition of all subject marks
- **Average Calculation**: Total marks ÷ Number of subjects
- **Grade Assignment**: Conditional logic based on percentage ranges
- **Performance Analysis**: Array traversal to find min/max values

### Data Structures Used
- **Arrays**: Store subject names and marks
- **Variables**: Handle calculations and user input
- **Scanner Class**: Manage user input operations

### Programming Concepts Demonstrated
- Array manipulation and iteration
- Input validation and error handling
- Conditional statements (if-else chains)
- Loops (for loops, while loops)
- String formatting and output presentation
- Mathematical operations and calculations

## File Structure

```
StudentGradeCalculator.java    # Main program file
README.md                     # Documentation file
```

## Error Handling

The program handles common errors:
- **Invalid marks range**: Prompts for re-entry if marks are outside 0-100
- **Invalid subject count**: Validates positive number of subjects
- **Input type errors**: Manages non-numeric inputs gracefully

## Future Enhancements

Possible improvements for this application:
- **File I/O**: Save and load grade reports
- **Multiple Students**: Handle batch processing for entire class
- **Weighted Grades**: Support for different subject weightages
- **Letter Grade Customization**: Allow custom grade scale setup
- **Statistical Analysis**: Add mean, median, mode calculations
- **GUI Version**: Create user-friendly graphical interface
- **Export Options**: Generate PDF or Excel reports

## Educational Value

This project demonstrates:
- **Basic Java Programming**: Variables, arrays, loops, conditions
- **Input/Output Operations**: Scanner usage and formatted output
- **Mathematical Computing**: Percentage calculations and statistical analysis
- **Data Validation**: Error checking and user input validation
- **Report Generation**: Structured data presentation
- **Problem-Solving**: Breaking complex requirements into manageable parts

## Use Cases

- **Students**: Calculate their overall grades and identify improvement areas
- **Teachers**: Quick grade calculation for student assessments
- **Educational Institutions**: Standard grading system implementation
- **Learning Tool**: Understanding grade calculation methodology
