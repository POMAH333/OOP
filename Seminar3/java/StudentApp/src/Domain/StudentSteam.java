package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    private List<StudentGroup> steam;
    private Integer idSteam;

    /**
     * Класс описания потока студентов
     * 
     * @param steam   - список групп потока
     * @param idSteam - идентификатор потока
     */
    public StudentSteam(List<StudentGroup> steam, Integer idSteam) {
        this.steam = steam;
        this.idSteam = idSteam;
    }

    public List<StudentGroup> getSteam() {
        return steam;
    }

    public void setSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    public Integer getIdSteam() {
        return idSteam;
    }

    public void setIdSteam(Integer idSteam) {
        this.idSteam = idSteam;
    }

    // Переопределение итератора для класса
    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(steam);
    }

    // Переопределение метода ToString
    @Override
    public String toString() {

        // Формирование списка студентов для вывода
        StringBuilder builder = new StringBuilder();
        for (StudentGroup groupValue : steam) {
            for (Student value : groupValue) {
                builder.append("GroupID: ");
                builder.append(groupValue.getIdGroup());
                builder.append(", ");
                builder.append(value.getName());
                builder.append("\n");
            }
        }

        return "Steam [ID=" + idSteam + ", groups=" + steam.size() + "]" + "\n" + builder;
    }
}
