package mbat.master.dto;

public class CourseProgressDto {
    private int course1Progress;
    private int course2Progress;
    private int course3Progress;

    public CourseProgressDto(int course1Progress, int course2Progress, int course3Progress) {
        this.course1Progress = course1Progress;
        this.course2Progress = course2Progress;
        this.course3Progress = course3Progress;
    }

    public int getCourse1Progress() {
        return course1Progress;
    }

    public void setCourse1Progress(int course1Progress) {
        this.course1Progress = course1Progress;
    }

    public int getCourse2Progress() {
        return course2Progress;
    }

    public void setCourse2Progress(int course2Progress) {
        this.course2Progress = course2Progress;
    }

    public int getCourse3Progress() {
        return course3Progress;
    }

    public void setCourse3Progress(int course3Progress) {
        this.course3Progress = course3Progress;
    }
}
