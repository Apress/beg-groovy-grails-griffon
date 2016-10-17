 class StringExtended {
 static String firstUpper(String self) {
 return self[0].toUpperCase() + self[1..self.length() - 1]
 }
 } 
 use (StringExtended){
 assert "aaaa".firstUpper() == "Aaaa"
 }
