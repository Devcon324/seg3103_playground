defmodule Grades.Calculator do

  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)

    mark = calculate_grade(avg_homework, avg_labs, midterm, final)
    round(mark * 100)
  end

  def letter_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)
    avg_exams = (midterm + final) / 2
    num_labs = num_labs(labs)

    if failed_to_participate(avg_homework, avg_exams, num_labs) do
      "EIN"
    else
      mark = calculate_grade(avg_homework, avg_labs, midterm, final)
      grade(mark, :letter)
    end
  end

  def numeric_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    avg_homework = avg(homework)
    avg_labs = avg(labs)
    avg_exams = (midterm + final) / 2
    num_labs = num_labs(labs)

    if failed_to_participate(avg_homework, avg_exams, num_labs) do
      0
    else
      mark = calculate_grade(avg_homework, avg_labs, midterm, final)
      grade(mark, :numeric)
    end
  end

  # helper method avg, reduces repetitive code
  def avg(list) do
    if Enum.count(list) == 0 do
      0
    else
      Enum.sum(list) / Enum.count(list)
    end
  end

  # helper method failed_to_participate, reduces repetitive code
  def failed_to_participate(avg_homework, avg_exams, num_labs) do
    avg_homework < 0.4 || avg_exams < 0.4 || num_labs < 3
  end

  # helper method calculate_grade, reduces repetitive code
  def calculate_grade(avg_homework, avg_labs, midterm, final) do
    0.2 * avg_labs + 0.3 * avg_homework + 0.2 * midterm + 0.3 * final
  end

  # helper method number of labs, reduces repetitive code
  def num_labs(labs) do
    labs
    |> Enum.reject(fn mark -> mark < 0.25 end)
    |> Enum.count()
  end

  # helper method method grades numeric and letter
  # takes the mark and the desired type of grade numeric or letter
  # returns the grade based on the mark in the desired type
  def grade(mark, type) do
    # case statement to determine the grade with nested if statements
    cond do
      mark > 0.895 -> (if type == :letter, do: "A+", else: 10)
      mark > 0.845 -> (if type == :letter, do: "A",  else: 9)
      mark > 0.795 -> (if type == :letter, do: "A-", else: 8)
      mark > 0.745 -> (if type == :letter, do: "B+", else: 7)
      mark > 0.695 -> (if type == :letter, do: "B",  else: 6)
      mark > 0.645 -> (if type == :letter, do: "B-", else: 5)
      mark > 0.595 -> (if type == :letter, do: "C+", else: 4)
      mark > 0.545 -> (if type == :letter, do: "C",  else: 3)
      mark > 0.495 -> (if type == :letter, do: "C-", else: 2)
      mark > 0.395 -> (if type == :letter, do: "D",  else: 1)
      :else -> (if type == :letter, do: "F", else: 0)
    end
  end
end
