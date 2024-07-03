defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  # Test percentage_grade with Homework and labs are empty
  describe "percentage_grade/1" do
    test "empty homework and labs" do
      assert 0 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.0,
                 final: 0.0
               })
    end
  end
  # Test percentage_grade with Homework is not empty, labs are empty
  describe "percentage_grade/2" do
    test "empty labs" do
      assert 30 ==
               Calculator.percentage_grade(%{
                 homework: [1],
                 labs: [],
                 midterm: 0.0,
                 final: 0.0
               })
    end
  end
  # Test percentage_grade with Homework is empty, labs are not empty
  describe "percentage_grade/3" do
    test "empty homework" do
      assert 20 ==
               Calculator.percentage_grade(%{
                 homework: [],
                 labs: [1],
                 midterm: 0.0,
                 final: 0.0
               })
    end
  end
  # Test percentage_grade with Homework, labs, midterm and final are empty
  describe "percentage_grade/4" do
    test "empty homework, labs, midterm and final" do
      assert 50 ==
               Calculator.percentage_grade(%{
                 homework: [1],
                 labs: [1],
                 midterm: 0,
                 final: 0
               })
    end
  end

  # Test letter_grade Homework and labs are empty, avg_homework < 0.4, avg_exams < 0.4, num_labs < 3
  describe "letter_grade/1" do
    test "empty homework and labs, avg_homework < 0.4, avg_exams < 0.4, num_labs < 3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.0,
                 final: 0.0
               })
    end
  end
  # Test letter_grade with Homework not empty, labs empty, num_labs < 3
  describe "letter_grade/2" do
    test "empty labs, num_labs < 3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end
  # Test letter_grade with Homework empty, labs not empty, num_labs < 3
  describe "letter_grade/3" do
    test "empty homework, num_labs < 3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [],
                 labs: [1, 1],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end
  # Test letter_grade with avg_homework >= 0.4, avg_exams >= 0.4, num_labs >= 3, grade A
  describe "letter_grade/4" do
    test "avg_homework >= 0.4, avg_exams >= 0.4, num_labs >= 3, grade A" do
      assert "A+" ==
               Calculator.letter_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 1,
                 final: 1
               })
    end
  end
  # Test letter_grade tro get grade F
  describe "letter_grade/5" do
    test "grade F" do
      assert "F" ==
               Calculator.letter_grade(%{
                 homework: [0.4],
                 labs: [0.4, 0.4, 0.4],
                 midterm: 0.5,
                 final: 0.3
               })
    end
  end

  # Test numeric_grade Homework and labs are empty, avg_homework < 0.4, avg_exams < 0.4, num_labs < 3
  describe "numeric_grade/1" do
    test "empty homework and labs, avg_homework < 0.4, avg_exams < 0.4, num_labs < 3" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [],
                 labs: [],
                 midterm: 0.0,
                 final: 0.0
               })
    end
  end
  # Test numeric_grade with Homework not empty, labs empty, num_labs < 3
  describe "numeric_grade/2" do
    test "empty labs, num_labs < 3" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end
  # Test numeric_grade with Homework empty, labs not empty, num_labs < 3
  describe "numeric_grade/3" do
    test "empty homework, num_labs < 3" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [],
                 labs: [1, 1],
                 midterm: 0.4,
                 final: 0.4
               })
    end
  end
  # Test numeric_grade with avg_homework >= 0.4, avg_exams >= 0.4, num_labs >= 3, grade A
  describe "numeric_grade/4" do
    test "avg_homework >= 0.4, avg_exams >= 0.4, num_labs >= 3, grade A" do
      assert 10 ==
               Calculator.numeric_grade(%{
                 homework: [1],
                 labs: [1, 1, 1],
                 midterm: 1,
                 final: 1
               })
    end
  end
  # Test numeric_grade tro get grade F
  describe "numeric_grade/5" do
    test "grade F" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0.4],
                 labs: [0.4, 0.4, 0.4],
                 midterm: 0.5,
                 final: 0.3
               })
    end
  end

end
