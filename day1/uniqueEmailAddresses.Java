class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> results = new HashSet<>();
        for(String email : emails) {
            List<String> split = Arrays.asList(email.split("@"));
            String local = split.get(0);
            local = local.replaceAll("\\.", "");
            if (local.indexOf("+") > 0) {
                local = local.substring(0,local.indexOf("+"));
            }
            results.add(local+"@"+split.get(1));
        }
        
        return results.size();
    }
}
