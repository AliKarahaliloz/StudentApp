/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentapp;

interface ArticleScoreBehavior {
    float articleScore();
}

interface ConferenceScoreBehavior {
    float conferenceScore();
}

interface ProjectScoreBehavior {
    float projectScore();
}

abstract class Student {
    int id;
    float mid;
    float fin;

    public Student(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }
}

class BachelourStudent extends Student implements ProjectScoreBehavior {
    public BachelourStudent(int id, float mid, float fin) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    float computeTotalScore() {
        // Implementation for total score calculation
        return 0.0f;
    }

    float projectScore() {
        // Implementation for project score calculation
        return 0.0f;
    }
}

class MasterStudent extends Student implements ConferenceScoreBehavior {
    int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf) {
        this.id = id;
        this.mid = mid;
        this.fin = fin;
        this.numberOfConf = numberOfConf;
    }

    float computeTotalScore() {
        // Implementation for total score calculation
        return 0.0f;
    }

    float conferenceScore() {
        // Implementation for conference score calculation
        return 0.0f;
    }
}

class PhDStudent extends MasterStudent implements ArticleScoreBehavior {
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int conf, int numberOfArticles) {
        super(id, mid, fin, conf);
        this.numberOfArticles = numberOfArticles;
    }

    float computeTotalScore() {
        // Implementation for total score calculation
        return 0.0f;
    }

    float articleScore() {
        // Implementation for article score calculation
        return 0.0f;
    }
}

public class MyClass {
    public static void main(String args[]) {
        // Main class implementation
    }
}
