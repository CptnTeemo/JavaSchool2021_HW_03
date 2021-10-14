# Домашнее задание к лекции 5 (Java Collection framework)

**#Задача 1**

Задача должна быть решена в классе Calculator, метод

`public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber)`
 
Дано два списка.

Каждый представляет собой число, записанное в обратном порядке.

Вернуть сумму этих чисел.

**Пример**:
   * firstNumber 1 - 2  -> 21
   * secondNumber 3 - 4 - 5  -> 543
   * Результат: 21 + 543 = 564
   
После решения задачи нужно убедиться, что тесты проходят:

`gradle build test`

**#Задача 2**
      
Задача должна быть решена в классе Calculator, метод

`public <T> List<T> getOddElements(List<T> list)`

Дан список из любых элементов (число, строка и.т.д).
В результате вернуть список состоящий только из нечетных элементов исходного списка.

**Пример:** [1, 2, 3] - [1, 3]
            ['Task', 'Other Task', 'Task 4'] - ['Task', 'Task 4']

**#Задача 3**
      
Задача должна быть решена в классе Calculator, метод

`public <T> List<T> getBounds(List<T> list)`

Дан список из любых элементов (число, строка и.т.д).
В результате вернуть список состоящий только первого и последнего элементов исходного списка.

**Пример:** 
* [1, 2, 3, 4] -> [1, 4]

* [1] -> [1]

* [] -> []