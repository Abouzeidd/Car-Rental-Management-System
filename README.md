# Car Rental Management System

A Java-based management system for handling vehicle rentals, customer information, and rental transactions. This project demonstrates object-oriented programming principles with core functionality for managing rental operations.

## 📋 Features

- **Vehicle Management**: Add, retrieve, and manage vehicle inventory
- **Customer Management**: Maintain customer records and rental history
- **Rental Operations**: Process rental transactions, track active rentals, and manage returns
- **Manager Classes**: Dedicated managers for vehicles and rentals to handle business logic

## 🗂️ Project Structure

```
Car-Rental-Management-System/
├── Vehicle.java              # Vehicle entity class
├── Customer.java             # Customer entity class
├── Rental.java              # Rental transaction class
├── Rental_Manager.java      # Handles rental operations
├── VehicleManager.java      # Handles vehicle operations
└── README.md                # Project documentation
```

## 📝 Class Overview

### Vehicle.java
Represents a vehicle in the rental system.
- Properties: vehicle ID, type, brand, model, daily rate, availability status
- Methods: getters/setters, availability checking

### Customer.java
Stores customer information and rental history.
- Properties: customer ID, name, contact, email, license number
- Methods: customer details management

### Rental.java
Represents a rental transaction between customer and vehicle.
- Properties: rental ID, customer, vehicle, rental date, return date, total cost
- Methods: rental details, cost calculation

### Rental_Manager.java
Manages all rental operations and transactions.
- Create new rentals
- Process returns
- Track active rentals
- Calculate rental costs
- Generate rental history

### VehicleManager.java
Handles vehicle inventory and availability.
- Add vehicles to inventory
- Update vehicle availability
- Track vehicle status
- Retrieve vehicle information

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK 8 or higher)
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code with Java extensions)

### Installation

1. Clone or download the repository
2. Open the project in your Java IDE
3. Compile all Java files:
   ```bash
   javac *.java
   ```

### Running the Project

Execute the main class (typically Rental_Manager or a separate Main class):
```bash
java Rental_Manager
```

## 💡 Usage Example

```java
// Create a vehicle
Vehicle vehicle = new Vehicle("V001", "SUV", "Toyota", "RAV4", 50.0);

// Create a customer
Customer customer = new Customer("C001", "Ahmed Hassan", "01234567890", "ahmed@email.com", "DL123456");

// Create a rental
Rental rental = new Rental("R001", customer, vehicle, "2024-01-15", "2024-01-20");

// Calculate cost
double totalCost = rental.calculateCost();
```

## 🔧 Development Notes

- **OOP Principles**: The project follows encapsulation, inheritance, and polymorphism
- **Data Structures**: Uses ArrayList/HashMap for managing collections of vehicles, customers, and rentals
- **Error Handling**: Consider implementing try-catch blocks for robust error management
- **Database Integration**: Future enhancement could include database connectivity (MySQL/SQLite)

## 🎯 Future Enhancements

- [ ] Database integration for persistent storage
- [ ] GUI using Swing/JavaFX
- [ ] Payment processing integration
- [ ] Email notifications for rental reminders
- [ ] Customer rating and review system
- [ ] Insurance and damage tracking
- [ ] REST API for mobile app integration

## 📦 Dependencies

- No external dependencies required (standard Java library)

## 👤 Author

Abouzeid

## 📄 License

This project is provided as-is for educational purposes.

## 📞 Contact & Support

For questions or issues, please refer to the project repository or contact the maintainer.

---

**Last Updated**: 2024 | **Status**: Active Development
