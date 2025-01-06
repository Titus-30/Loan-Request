# Loan Request System

## Table of Contents
1. [Description](#description)
2. [Features](#features)
3. [Requirements](#requirements)
4. [How to Run the Application](#how-to-run-the-application)
5. [Example](#example)
6. [Contributing](#contributing)
7. [License](#license)
8. [Contact](#contact)

## Description
This is a Java-based application for processing loan requests. The system allows a client to apply for a loan by entering their salary, loan amount, and loan period. The application validates the input data, calculates the repayment schedule, and allows the client to make payments towards the loan.

## Features
- **Salary Validation**: Ensures that the salary entered is above a minimum threshold of 5,000,000.
- **Loan Period Validation**: Ensures that the loan period does not exceed 12 months.
- **Repayment Schedule**: Displays the loan repayment schedule including monthly interest, principal, and remaining balance.
- **Loan Payment**: Allows the client to make payments towards the loan, showing remaining balance if fully or partially paid.

## Requirements
- Java version 8 or higher.
- A terminal or IDE to run Java applications.

## How to Run the Application

### 1. Clone the repository
   - Clone the project to your local machine using the following command:
     ```
     git clone <repository_url>
     ```

### 2. Compile the program
   - Open a terminal and navigate to the project folder.
   - Compile the program using:
     ```
     javac LoanRequest.java
     ```

### 3. Run the program
   - To run the program, execute the following command:
     ```
     java LoanRequest
     ```

### 4. Follow the prompts
   - The program will ask for various inputs:
     - **Client name**: Enter the name of the client.
     - **Salary**: Enter the client’s salary (must be at least 5,000,000).
     - **Loan amount**: Enter the desired loan amount.
     - **Loan period**: Enter the loan period (maximum 12 months).
   - The program will then display a repayment schedule and allow the client to pay the loan in full or partially.

## Example

## Contributing
If you wish to contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch for your feature.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Create a pull request to the main repository.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For further questions, you can contact the repository maintainer at `your.email@example.com`.
