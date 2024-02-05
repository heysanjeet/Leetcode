class Solution {
    //The main idea is to push to the stack every valid file name (not in {"",".",".."})
    //popping only if there's somthing to pop and we met "..".
    public String simplifyPath(String path) {
        Deque<String> stack=new LinkedList<>();
        Set<String> skip=new HashSet<>(Arrays.asList("..",".",""));
        for(String dir : path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!skip.contains(dir)){
                stack.push(dir);
            }
            
        }
         String result="";
            for(String dir: stack){
                result="/"+dir+result;
            }
        return result.isEmpty() ? "/" :result;
    }
}