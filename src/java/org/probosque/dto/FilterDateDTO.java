package org.probosque.dto;

public class FilterDateDTO {

    private String start;
    private String end;

    public FilterDateDTO(String start, String end){
        this.start = start;
        this.end = end;
    }
    
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getSQLBetween() {
        return "BETWEEN '" + this.start + "' AND '" + this.end + "'";
    }       
}
