import java.util.*;

public class KaKao_ReportResult {

    public int[] solution(String[] id_list, String[] report, int k) {

        String[][] reportPeople = reportPeopleName(report);

        Map<String, Integer> reportedPeople = reportedPersonTimes(reportPeople);

        List<String> stopId = stopId(reportedPeople, k);

        List<String> sendMailId = sendMailId(stopId, reportPeople);

        return sendMailCount(id_list, sendMailId);
    }

    private String[][] reportPeopleName(String[] report){
        HashSet<String> deduplicationReport = new HashSet<>(Arrays.asList(report));
        String[] deduplicationReportArray = deduplicationReport.toArray(new String[0]);
        String[][] reportPeople = new String[deduplicationReportArray.length][2];

        for(int i=0; i < deduplicationReportArray.length; i++){
            String[] splitReport = deduplicationReportArray[i].split(" ");
            reportPeople[i][0] = splitReport[0];
            reportPeople[i][1] = splitReport[1];
        }

        return reportPeople;
    }

    private Map<String, Integer> reportedPersonTimes(String[][] reportPeople){
        Map<String, Integer> reportedPeople = new HashMap<>();
        for(String[] re : reportPeople){
            reportedPeople.put(re[1], 0);
        }

        for(String[] re : reportPeople){
            if(reportedPeople.containsKey(re[1])){
                reportedPeople.put(re[1], reportedPeople.get(re[1]) + 1);
            }
        }
        return reportedPeople;
    }

    private List<String> stopId(Map<String, Integer> reportedPeople, int k){
        List<String> stopId = new ArrayList<>();
        reportedPeople.forEach((s,v) ->{
            if(v >= k){
                stopId.add(s);
            }
        });
        return stopId;
    }

    private List<String> sendMailId(List<String> stopId, String[][] reportPeople){
        List<String> sendMailId = new ArrayList<>();

        for(String[] re : reportPeople){
            for(String id : stopId){
                if(re[1].equals(id)){
                    sendMailId.add(re[0]);
                }
            }
        }
        return sendMailId;
    }

    private int[] sendMailCount(String[] id_list, List<String> sendMailId){
        int[] sendMailCount = new int[id_list.length];
        for(int i=0; i < id_list.length; i++){
            for(String id : sendMailId) {
                if(id_list[i].equals(id)){
                    sendMailCount[i] += 1;
                }
            }
        }
        return sendMailCount;
    }

}
