# Banking Service with Facade Design Pattern

This Java program demonstrates the implementation of a Facade design pattern for a Banking Service. The Banking Service provides access to various modules such as Checking, Saving, and Investment, but it simplifies the interaction by providing a unified interface.

## Table of Contents

- [Design Pattern](#design-pattern)
- [Modules](#modules)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Design Pattern

### Facade Design Pattern

The Facade design pattern is used to provide a simplified interface to a complex system of classes, making it easier to interact with. In this program, we use the Facade pattern to encapsulate the complexities of the Checking, Saving, and Investment modules and offer a unified `BankingServiceFacade` for clients to interact with.

## Modules

### Checking Module

The Checking module allows users to perform various banking operations related to checking accounts, such as depositing, withdrawing, and checking the account balance.

### Saving Module

The Saving module provides functionality for savings accounts, including depositing, withdrawing, and checking the account balance.

### Investment Module

The Investment module offers options for managing investment portfolios, including buying and selling stocks.

## Usage

To run the program, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/yourusername/banking-service-facade.git
