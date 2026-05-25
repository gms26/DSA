// Last updated: 5/25/2026, 11:08:43 AM
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder st=new StringBuilder();
        Trie trie=new Trie();
        for(String word:dictionary){
            trie.addWord(word);
        }
        String words[]=sentence.split(" ");
        for(String word:words){
            String prefix=trie.findPrefix(word);
            if(prefix==""){
                st.append(word);
            }else{
                st.append(prefix);
            }
            st.append(" ");
        }

        return st.toString().trim();
    }
}

class Node{
    Node child[];
    boolean isWord;
    Node(){
        child=new Node[26];
    }
}
class Trie{
    Node root;
    Trie(){
        root=new Node();
    }

    public void addWord(String word){
        Node temp=root;
        for(char ch:word.toCharArray()){
            int index=ch-'a';
            //the character is not present
            if(temp.child[index]==null){
                temp.child[index]=new Node();
            }
            //move temp to that child node
            temp=temp.child[index];
        }
        //after all this operation temp would be on last char
        temp.isWord=true;
    }
     
     //if prefix is present return it else return emmpty string
     public String findPrefix(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            //the character is not present prefix cannot be found
            if(temp.child[index]==null){
                return "";
            }
            //move temp to that child node
            temp=temp.child[index];
            if(temp.isWord){
               return word.substring(0,i+1);
            }
        }
        return "";
    }
}