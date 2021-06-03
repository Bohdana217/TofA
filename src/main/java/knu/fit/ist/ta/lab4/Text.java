/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class Text {
    public static String text;
        static Matcher matcher;
        static Pattern pattern;

        public Text(){
            text = "The Internet of Things essentially enables us to connect ‘things’ to the Internet"
                    + "(and to networks that use Internet technology). These things or items can exchange information between them and transmit data to "
                    + "other devices and systems. They can usually also received data. The information they share can be about objects to which they are "
                    + "attached and the environment they are in (through sensors that come in many shapes for different parameters). Smart devices and machines"
                    + " can also share information about their internal state."
                    + " So, they don’t play games or buy online but capture data, share it and, depending"
                    + " on the precise thing, can act upon data they receive. In other words: physical objects and lots of them, far more than there are people."
                    + " The physical things can dispose of embedded technologies enabling them to do all this (hence often called ‘smart’) or can be rather ‘dumb’ "
                    + "as such but get equipped/tagged to be connected. The Internet of Things is a collective term for these connected things, how they communicate"
                    + " and transmit data, the technologies enabling them to do so, and the reasons/goals why this is done."
                    + " While the Internet of Things starts with the infrastructure of connected things, both its benefits and risks are mainly related to the network"
                    + " technologies, systems, and applications built upon this underlying layer. In theory, anything can be connected to the Internet using IoT"
                    + " technologies: physical objects and living creatures, including animals and people as ‘beings’. All things or connected components of more complex"
                    + " physical objects can be uniquely identified and addressed via the Internet of Things."
                    + " Examples of things range from consumer-oriented devices such as wearables and smart home solutions (Consumer IoT) to connected equipment in the"
                    + " enterprise (Enterprise IoT) and industrial assets such as machines, robots, or even workers in smart factories and industrial facilities.";
        }

        public static String cleanText(String ctext){

            ctext = ctext.toLowerCase();
            ctext = ctext.replaceAll("\\bthe|and\\b", "").trim();
            ctext = ctext.replaceAll("\\b\\w{1,2}\\b", "").trim();
            ctext = ctext.replaceAll("[^\\w -]", "").trim();
            ctext = ctext.replaceAll("-{2,}","");
            ctext = ctext.replaceAll(" {2,}"," ");
            return ctext;
        }

        public static List<String> getList(String text) {
            List<String> result = Arrays.asList(text.split(" "));
            return result;
        }

        public static int sizeOfList(String text) {
            List<String> result = Arrays.asList(text.split(" "));
            return result.size();
        }

        public static Set<String> getSet(String text) {
            Set<String> result = new HashSet<>();
            result.addAll(Arrays.asList(text.split(" ")));
            return result;
        }

        public static int sizeOfSet(String text) {
            Set<String> result = new HashSet<>();
            result.addAll(Arrays.asList(text.split(" ")));
            return result.size();
        }

        public static ArrayList<String> first7Often(String text) {
            List<String> words = Arrays.asList(text.split(" "));
            ArrayList<String> result = new ArrayList<String>();

            int size = words.size();
            int m = 7; // m - the number of words to perform calculations for
            int[] z = new int[size];
            // z[i] - frequency of occurrence of the word with serial number i
            int[] n = new int[m];
            int[] t = new int[m];
            for(int j=0;j<size;++j){
                z[j]=0;
                for(int i=0; i<size ;++i){

                    if(words.get(j).equals(words.get(i))){
                        z[j]=z[j]+1;
                    }

                }
                for(int q=0;q<j;++q){   //avoid the same words
                    if(words.get(j).equals(words.get(q))) z[j]=0;
                }
            }

            for(int j=0; j<m;++j){
                for(int i=0;i<size;++i){

                    if(z[i]>t[j]){
                        t[j]=z[i];  //the highest frequency of occurence
                        n[j]=i;     //the serial number of the word
                    }

                }
                z[n[j]]=0;  //not to repeat words
            }
            for(int y=0;y<m;++y){
                result.add(words.get(n[y])+" - "+t[y]);
            }

            return result;
        }

        public static int notU(String text){
            int p = 0;
            pattern = Pattern.compile(("\\b[a-tv-z]+\\b"));
            matcher = pattern.matcher(text);
            while(matcher.find()){
                ++p;
            }
            return p;
        }

        public static int words4Letters(String text){
            int p = 0;
            pattern = Pattern.compile(("\\b[a-z]{4}\\b"));
            matcher = pattern.matcher(text);
            while(matcher.find()){
                ++p;
            }
            return p;
        }

        public static ArrayList<String> seq3Let(String text){
            int p = 0;
            String stext = text;
            String fseq;

            int t=0, m=6, d=0; // m - the number of sequences to perform calculations with
            // d - so as not to repeat the sequence, t - frequency of occurrence
            String seq="";
            ArrayList<String> all = new ArrayList<String>();
            ArrayList<String> result = new ArrayList<String>();

            for(int q=0;q<m;++q){
                t=0;
                for(int i=3, j=0;i<text.length();++i){
                    p=0;
                    d=0;
                    if(stext.charAt(i-1)==' '){
                        i += 3;
                        j += 3;
                    }
                    fseq = stext.substring(j, i);
                    for(int z=0;z<q;++z){
                        if(fseq.equals(all.get(z))){d = 1;}
                    }
                    pattern = Pattern.compile(fseq);
                    matcher = pattern.matcher(text);
                    while(matcher.find() && d!=1){
                        ++p;
                    }
                    if(p>t){t=p;seq=fseq;}
                    ++j;
                }
                all.add(seq);
                result.add(seq+" - "+t);
            }
            return result;
        }
}
