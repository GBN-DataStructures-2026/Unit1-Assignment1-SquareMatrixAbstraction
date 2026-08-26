# Unit 1 - Assignment 1: Square Matrix Abstraction

## Objective
Demonstrate data abstraction by creating two completely different internal implementations (`DenseSquareMatrix` using a 2D array, and `FlattenedSquareMatrix` using a 1D array) that fulfill the exact same `SquareMatrixInterface`.

---

## File Structure Overview

You will work with four primary files in this repository:

1. **`SquareMatrixInterface.java`** (Provided)  
   The interface defining the required methods for all square matrix classes.
2. **`DenseSquareMatrix.java`** (To Complete)  
   Implements `SquareMatrixInterface` using a 2D array (`int[][] grid`).
3. **`FlattenedSquareMatrix.java`** (To Complete)  
   Implements `SquareMatrixInterface` using a 1D array (`int[] list`).
4. **`SquareMatrixTest.java`** (Provided)  
   The unit test suite verifying both implementations and cross-compatibility.

---

## Class Implementation Details

### 1. `DenseSquareMatrix.java`
Stores data in standard 2D array format: `private int[][] matrix;`
* **Constructor 1:** `DenseSquareMatrix(int n)` $\rightarrow$ Initializes an $n \times n$ 2D array.
* **Constructor 2:** `DenseSquareMatrix(int[][] other)` $\rightarrow$ Sets size and populates values from an existing 2D array.
* **Indexing:** Access elements directly using `matrix[r][c]`.

### 2. `FlattenedSquareMatrix.java`
Stores data in a single 1D array: `private int[] matrix;` of total length $n^2$.
* **Constructor 1:** `FlattenedSquareMatrix(int n)` $\rightarrow$ Initializes a 1D array of length $n \times n$.
* **Constructor 2:** `FlattenedSquareMatrix(int[][] other)` $\rightarrow$ Flattens a 2D array into the 1D array structure.
* **The 1D Index Formula:** Convert row $r$ and column $c$ in an $n \times n$ matrix into a 1D array index:
  You can figure out a formula for the index based on r, c, and n.

---

## Crucial Rule for `add()` and `subtract()`

When writing `add(SquareMatrixInterface other)` or `subtract(SquareMatrixInterface other)`, **do NOT assume `other` is the same internal type as `this`!**

Always access values of `other` through its public interface method `.getValue(r, c)`:



You may return either a new `DenseSquareMatrix` or `FlattenedSquareMatrix` for the result, as long as it returns a valid `SquareMatrixInterface` object.

---
