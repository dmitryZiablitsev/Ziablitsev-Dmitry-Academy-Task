import java.util.HashMap;
import java.util.Map;
public class Intervals {


    public static Map<Integer,String> NOTES_1(){
        Map<Integer,String> NOTES_1 = new HashMap<>();
        NOTES_1.put(1,"Cbb");
        NOTES_1.put(2,"");
        NOTES_1.put(3,"Dbb");
        NOTES_1.put(4,"");
        NOTES_1.put(5,"Ebb");
        NOTES_1.put(6,"Fbb");
        NOTES_1.put(7,"");
        NOTES_1.put(8,"Gbb");
        NOTES_1.put(9,"");
        NOTES_1.put(10,"Abb");
        NOTES_1.put(11,"");
        NOTES_1.put(12,"Bbb");
        return NOTES_1;
    }
    public static Map<Integer,String> NOTES_2(){
        Map<Integer,String> NOTES_2 = new HashMap<>();
        NOTES_2.put(1,"Cb");
        NOTES_2.put(2,"");
        NOTES_2.put(3,"Db");
        NOTES_2.put(4,"");
        NOTES_2.put(5,"Eb");
        NOTES_2.put(6,"Fb");
        NOTES_2.put(7,"");
        NOTES_2.put(8,"Gb");
        NOTES_2.put(9,"");
        NOTES_2.put(10,"Ab");
        NOTES_2.put(11,"");
        NOTES_2.put(12,"Bb");
        return NOTES_2;
    }
    public static Map<Integer,String> NOTES_3(){

        Map<Integer,String> NOTES_3 = new HashMap<>();

        NOTES_3.put(1,"C");
        NOTES_3.put(2,"");
        NOTES_3.put(3,"D");
        NOTES_3.put(4,"");
        NOTES_3.put(5,"E");
        NOTES_3.put(6,"F");
        NOTES_3.put(7,"");
        NOTES_3.put(8,"G");
        NOTES_3.put(9,"");
        NOTES_3.put(10,"A");
        NOTES_3.put(11,"");
        NOTES_3.put(12,"B");

        return NOTES_3;
    }
    public static Map<Integer,String> NOTES_4(){
        Map<Integer,String> NOTES_4 = new HashMap<>();
        NOTES_4.put(1,"C#");
        NOTES_4.put(2,"");
        NOTES_4.put(3,"D#");
        NOTES_4.put(4,"");
        NOTES_4.put(5,"E#");
        NOTES_4.put(6,"F#");
        NOTES_4.put(7,"");
        NOTES_4.put(8,"G#");
        NOTES_4.put(9,"");
        NOTES_4.put(10,"A#");
        NOTES_4.put(11,"");
        NOTES_4.put(12,"B#");
        return NOTES_4;
    }
    public static Map<Integer,String> NOTES_5(){
        Map<Integer,String> NOTES_5 = new HashMap<>();
        NOTES_5.put(1,"C##");
        NOTES_5.put(2,"");
        NOTES_5.put(3,"D##");
        NOTES_5.put(4,"");
        NOTES_5.put(5,"E##");
        NOTES_5.put(6,"F##");
        NOTES_5.put(7,"");
        NOTES_5.put(8,"G##");
        NOTES_5.put(9,"");
        NOTES_5.put(10,"A##");
        NOTES_5.put(11,"");
        NOTES_5.put(12,"B##");
        return NOTES_5;
    }

    public static Map<String,Integer> interval_name_VALUE(){

        Map<String,Integer> interval_name = new HashMap<>();

        interval_name.put("m2",1);
        interval_name.put("M2",2);
        interval_name.put("m3",3);
        interval_name.put("M3",4);
        interval_name.put("P4",5);
        interval_name.put("P5",7);
        interval_name.put("m6",8);
        interval_name.put("M6",9);
        interval_name.put("m7",10);
        interval_name.put("M7",11);
        interval_name.put("P8",12);

        return interval_name;
    }

    public static String intervalConstruction(String[] args) {
        String result="";
        try {
            if(args.length>3){
                throw new Exception();
            }else if(args.length<=1){
                throw new Exception();
            }
            else {
                String interval = args[0];
                String note = args[1];
                String sharp_or_b;
                if (args.length == 2) {
                    sharp_or_b = "asc";
                } else {
                    sharp_or_b = args[2];
                }
                int entered_key = 0;
                int interval_value = interval_name_VALUE().get(interval);
                final boolean statement = interval.equals("m2") || interval.equals("m3") || interval.equals("m6") || interval.equals("m7");

                if (sharp_or_b.equals("dsc")) {

                    if (NOTES_2().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_2().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_2().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_3().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_1().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_2().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_1().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_3().get(entered_key);
                                    }
                                }
                            }
                        }

                    } else if (NOTES_3().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_3().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_3().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_4().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_2().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_3().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_2().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_4().get(entered_key);
                                    }
                                }
                            }
                        }

                    } else if (NOTES_4().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_4().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_4().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_5().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_3().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key - interval_value;
                                    if (entered_key <=0) {
                                        entered_key = entered_key + 12;
                                    }
                                    result = NOTES_4().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_3().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_5().get(entered_key);
                                    }
                                }
                            }
                        }
                    }

                } else {
                    if (NOTES_2().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_2().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_2().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_1().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_3().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_2().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_1().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_3().get(entered_key);
                                    }
                                }
                            }
                        }

                    } else if (NOTES_3().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_3().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_3().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_2().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_4().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_3().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_2().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_4().get(entered_key);
                                    }
                                }
                            }
                        }

                    } else if (NOTES_4().containsValue(note)) {

                        for (Map.Entry<Integer, String> obj : NOTES_4().entrySet()) {
                            if (obj.getValue().equals(note)) {
                                entered_key = obj.getKey();
                                if (entered_key == 1 || entered_key == 5 || entered_key == 6 || entered_key == 12) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_4().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_3().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_5().get(entered_key);
                                    }
                                } else if (entered_key == 3 || entered_key == 8 || entered_key == 10) {
                                    entered_key = entered_key + interval_value;
                                    if (entered_key > 12) {
                                        entered_key = entered_key - 12;
                                    }
                                    result = NOTES_4().get(entered_key);
                                    if (result.equals("") && statement) {
                                        entered_key = entered_key + 1;
                                        result = NOTES_3().get(entered_key);
                                    } else if (result.equals("")) {
                                        entered_key = entered_key - 1;
                                        result = NOTES_5().get(entered_key);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Illegal number of elements in input array");
        }
        return result;
    }

    public static String intervalIdentification(String[] args) {
        String result="";
        int first_note_key=0;
        int last_note_key=0;
        int result_interval_value;
        boolean both_notes_in_same_map = false;
        try {
            if(args.length>3){
                throw new Exception();
            }else if(args.length<=1){
                throw new Exception();
            }
            else {
                String first_note = args[0];
                String last_note = args[1];
                String sharp_or_b;
                if (args.length == 2) {
                    sharp_or_b = "asc";
                } else {
                    sharp_or_b = args[2];
                }
                if(sharp_or_b.equals("dsc")){
                    if(NOTES_1().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for(Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=first_note_key-last_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=first_note_key-last_note_key+12;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_5().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-last_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-last_note_key+12+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_2().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_2().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=obj.getKey();
                            }
                        }
                        for(Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=first_note_key-last_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=first_note_key-last_note_key+12;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_1().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key+1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key+1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_3().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_3().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=first_note_key-last_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=first_note_key-last_note_key+12;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_2().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key+1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key+1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_4().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_4().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=first_note_key-last_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=first_note_key-last_note_key+12;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_3().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key+1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key+1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_5().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_5().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=first_note_key-last_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=first_note_key-last_note_key+12;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_4().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key+1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key+1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_1().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=first_note_key-1-last_note_key;
                            if(result_interval_value<=0){
                                result_interval_value=first_note_key-1-last_note_key+12;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }
                }else{
                    if(NOTES_1().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for(Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=last_note_key-first_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=last_note_key+12-first_note_key;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_5().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key-1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key-1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_2().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_2().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=obj.getKey();
                            }
                        }
                        for(Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=last_note_key-first_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=last_note_key+12-first_note_key;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_1().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key-1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key-1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_3().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_3().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=last_note_key-first_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=last_note_key+12-first_note_key;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_2().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_2().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key-1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key-1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_4().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_4().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=last_note_key-first_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=last_note_key+12-first_note_key;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_3().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_3().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key-1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key-1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_5().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }else if(NOTES_5().containsValue(first_note)){
                        for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                            if(obj.getValue().equals(first_note)){
                                first_note_key=first_note_key+obj.getKey();
                            }
                        }
                        for (Map.Entry<Integer,String> obj : NOTES_5().entrySet()){
                            if(obj.getValue().equals(last_note)){
                                last_note_key=last_note_key+obj.getKey();
                                both_notes_in_same_map=true;
                            }
                            if(both_notes_in_same_map){
                                result_interval_value=last_note_key-first_note_key;
                                if(result_interval_value<=0){
                                    result_interval_value=last_note_key+12-first_note_key;
                                }
                                for(Map.Entry<String,Integer> o: interval_name_VALUE().entrySet()){
                                    if(o.getValue()==result_interval_value){
                                        result=o.getKey();
                                    }else if(result_interval_value==6){
                                        result="P5";
                                    }
                                }
                            }
                        }
                        if(NOTES_4().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_4().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key-1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key-1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }else if(NOTES_1().containsValue(last_note)){
                            for (Map.Entry<Integer,String> obj : NOTES_1().entrySet()){
                                if(obj.getValue().equals(last_note)) {
                                    last_note_key = last_note_key+obj.getKey();
                                }
                            }
                            result_interval_value=last_note_key-first_note_key+1;
                            if(result_interval_value<=0){
                                result_interval_value=last_note_key+12-first_note_key+1;
                            }
                            for (Map.Entry<String,Integer> obj : interval_name_VALUE().entrySet()){
                                if(obj.getValue()==result_interval_value){
                                    result=obj.getKey();
                                }else  if(result_interval_value==6){
                                    result="P5";
                                }
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Illegal number of elements in input array");
        }
        return result;
    }
}