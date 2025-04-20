package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Electronic_Therapist {
    private List<String> questionList;
    private List<String> symptomList;


    public Electronic_Therapist(){
        questionList = new ArrayList<>();
        symptomList = new ArrayList<>();
    }

    /**
     * Метод, собирающий анамнез пациента
     * @return список всех симптомов пациента
     */
    public List<String> anamnesisCollection(){
        //todo добавить полноценную реализацию anamnesisCollection
        List<String> symptoms = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questionList.size(); i++){
            System.out.println(questionList.get(i));
            if (scanner.nextLine().trim().equalsIgnoreCase("да")){
                symptoms.add(symptomList.get(i));
            }
        }
        scanner.close();
        return symptoms;
    }

    /**
     * Метод, устанавливающий возможный диагноз на основе собранного списка симптомов
     * @param symptoms список симптомов пациента
     * @return возможный диагноз пациента
     */
    public String evaluateSymptoms(List<String> symptoms){
        //todo добавить полноценную реализацию evaluateSymptoms
        if  (symptoms.contains("боль в животе") && symptoms.contains("тошнота")){
            return "Возможный диагноз - гастрит. Необходимо исключить из рациона жирную пищу и обратиться к гастроэнтерологу";
        }
        return "Возможный диагноз - ангина/ОРВИ. Необходима консультация врача";
    }


    /**
     * Метод, добавляющий вопрос в список вопросов пациенту
     * @param question строка, содержащая сам вопрос
     */
    public void addQuestion(String question){
        questionList.add(question);
    }

    /**
     * Метод, возвращающий список вопросов пациенту
     * @return список, содержащий вопросы
     */
    public List<String> getQuestionList(){
        return questionList;
    }

    /**
     * Метод, добавляющий симптом в список симптомов
     * @param symptom строка, содержащая сам симптом
     */
    public void addSymptom(String symptom){
        symptomList.add(symptom);
    }

    /**
     * Метод, возвращающий список симптомов
     * @return список, содержащий симптомы
     */
    public List<String> getSymptomList(){
        return symptomList;
    }

}
