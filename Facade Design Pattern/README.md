# Introduction

Welcome to the Banking Service Java Program documentation. This document provides an overview of the project, class/interface details, implementation, and instructions for use.

## Project Overview

This project simulates a basic banking service using object-oriented principles in Java. It consists of various classes and interfaces to model different types of accounts and a facade pattern for account access.

## Class and Interface Details

### Account Interface

The `Account` interface defines a method for checking the account balance.

### Chequing Class

The `Chequing` class implements the `IAccount` interface and represents a checking account. It provides functionality to check the account balance.

### Saving Class

The `Saving` class implements the `IAccount` interface and represents a savings account. It provides functionality to check the account balance.

### Investment Class

The `Investment` class implements the `IAccount` interface and represents an investment account. It provides functionality to check the account balance.

### BankService Class

The `BankService` class acts as a facade and provides methods for accessing checking, savings, and investment accounts. It manages the underlying account classes.

### Customer Class

The `Customer` class represents a bank customer and interacts with the `BankService` to perform banking operations.

## Implementation Details

### Facade Design Pattern

This project follows the facade design pattern, which simplifies the interaction between the client and complex subsystems (account classes). The `BankService` acts as a unified interface to access different account types.

### UML Diagram

<img src="facade.png" height="400" width="550">

The UML diagram illustrates the relationships and structure of the classes and interfaces in this project.

## How to Use

To use the Banking Service Java Program, follow the steps mentioned in the [Getting Started](#getting-started) section of the README.

## Conclusion

This project serves as an educational example of implementing a basic banking service in Java. It showcases object-oriented principles and the use of the facade design pattern to simplify client interactions with complex subsystems.
