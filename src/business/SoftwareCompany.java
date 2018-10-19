package business;

public class SoftwareCompany {

    public static String name;   // полное название компании
    public static int year;   // год основания
    public static float salary_budget;

    public static class Address {
       // здесь необходимо указать адрес данной компании (страна,город,улица,номер)
    }

    public static class Contacts{
        // здесь необходимо указать контактную информацию компании (телефон, почтовый индекс, электронная почта)
    }

    // бюджет, выделенный под заработную плату сотрудников
    // в классе, указанном ниже, добавить сотрудников компании
    // - директора, менеджера и остальных членов команды

    public static class Team{}

    public static void showMembers() {
        //который отобразит всех сотрудников в формате:
        //Имя Фамилия должность опыт работы заработная плата
    }

    public static void calculateSalaryBudget() {
       // который возвращает значение заработной платы,
       // расчитанной за один год работы, принимая во
       // внимание текущий оклад всех сотрудников(заработная
       // плата, записанная в объектах, указана за 1месяц работы)
    }

    // добавьте методы, указанные выше

}

    /*статический Класс "SoftwareCompany" используется в этом примере как
    шаблон для построения других классов, поскольку через него осуществляется
    часть логики взаимодействия с компонентами компании.

      Напишите продолжение этой программы таким образом, чтобы:

        в статическом классе SoftwareCompany и во всех подклассах
        добавить указанные методы и свойства так, чтобы компания
        содержала 1 директора, 1 менеджера команды, 3 программиста
        с различным опытом работы и 1 тестировщика.

        рассчитать бюджет заработной платы компании за 1 год и отобразить
        результат

        рассчитать бюджет заработной платы компании на 3 года и
        отобразить результат (не забудьте, что заработная плата зависит от
        опыта, соответственно - опыт увеличивается с каждым годом деятельности!)

        отображения всех сотрудников компании с их текущей должностью, заработной
        платой и опытом работы
*/