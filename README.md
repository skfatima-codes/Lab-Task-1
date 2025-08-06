#  Triangle Class – OOP Lab Task 1

Hi, I'm a **2nd semester student** at **University of Karachi**, enrolled in the **UBIT Department**. This is my submission for **Week 05 – Lab Task 1**, focused on **Object-Oriented Programming in Java**.

---

##  Important Concepts

This lab task involves creating a **Triangle class** using Java that demonstrates key OOP concepts such as:

- Constructor Overloading
- Object Cloning
- Static Members
- Encapsulation (via Getters and Setters)
- Method Overloading
- Basic Geometric Logic (like checking for a right-angled triangle)

---

## UML Requirements

You are first instructed to **draw a UML diagram** for the class before implementing it.  
The UML should reflect:

- Data members: `sideA`, `sideB`, `sideC`
- Methods: Constructors, Getters, Setters, `perimeter()`, `isRightAngled()`, `toString()`, and `objectCount()`

---

##  Triangle Class Requirements (Java Version)

The class must include the following:

### 🔹 Constructors:
1. **Default Constructor**  
   Creates a triangle with all sides = `1.0`

2. **One-parameter Constructor**  
   Creates an **equilateral triangle** with all sides = given parameter

3. **Two-parameter Constructor**  
   Creates an **isosceles triangle** with sides: `x, x, y`

4. **Three-parameter Constructor**  
   Creates a triangle with sides: `x, y, z`

5. **Clone Constructor**  
   Accepts an existing `Triangle` object and creates a deep copy (clone)

---

###  Methods:
- `getSideA()`, `getSideB()`, `getSideC()`  
- `setSideA()`, `setSideB()`, `setSideC()`  
  *(Using standard Java getter/setter naming)*

- `double perimeter()`  
  Calculates and returns the perimeter

- `boolean isRightAngled()`  
  Checks if the triangle is right-angled using Pythagoras theorem

- `String toString()`  
  Returns a string representation of the triangle

- `static int objectCount()`  
  Returns total number of Triangle objects created

---

## 🔄 Concepts Covered

✅ Constructor Overloading  
✅ Object Cloning  
✅ Encapsulation  
✅ Static Members  
✅ Object Counting  
✅ Basic Math Logic  
✅ `toString()` Method  
✅ Geometric Validity

---

