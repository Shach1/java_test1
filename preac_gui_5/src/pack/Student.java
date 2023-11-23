package pack;

class Student implements Comparable<Student>
{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student student)
    {
        if (score == student.getScore()) return 0;
        if (score < student.getScore()) return -1;
        return 1;
    }
}
