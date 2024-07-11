# seg3103_playground

## Lab 06

### Prerequisite Step

```elixir
  # stub functions
  def percentage_grade(marks) do
    :rand.uniform(100)
  end

  def letter_grade(marks) do
    Enum.at([
      "A+", "A", "A-",
      "B+", "B",
      "C+", "C",
      "D+", "D",
      "E",
      "F"],
      :rand.uniform(10))
  end

  def numeric_grade(marks) do
    :rand.uniform(10)
  end
```

my results ont he web page after implementing stubs
![image](lab05\assets\stub.png)
