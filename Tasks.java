public class Tasks{
    private String taskInfo;
    private String dueDate;
    private String priority;
    private int status;

    public Tasks(String info, String date, String prior){
        this.taskInfo = info;
        this.dueDate = date;
        this.priority = prior;
        this.status = 0;
    }
    public String getTaskInfo(){
        return taskInfo;
    }
    public String getDueDate(){
        return dueDate;
    }
    public String getPriority(){
        return priority;
    }
    public int getStatus(){
        return status;
    }
    public void setStatus(){
        this.status = 1;
    }
    public String toString(){
        String statusSymbol = (status == 1) ? "x" : " ";
        if(statusSymbol != "x"){
            return "[" + statusSymbol + "]\t" + taskInfo + "\t(Due : " + dueDate + ", Priority : " + priority + ")";
        }else{
            return "[" + statusSymbol + "]\t" + taskInfo + "\t(Completed)";
        }
    }
}