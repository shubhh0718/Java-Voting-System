// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Candidate {
   private int candidateId;
   private String candidateName;
   private int votes;

   public Candidate(int var1, String var2) {
      this.candidateId = var1;
      this.candidateName = var2;
      this.votes = 0;
   }

   public int getCandidateId() {
      return this.candidateId;
   }

   public String getCandidateName() {
      return this.candidateName;
   }

   public int getVotes() {
      return this.votes;
   }

   public void addVote() {
      ++this.votes;
   }

   public String toString() {
      return "Candidate ID   : " + this.candidateId + "\nCandidate Name : " + this.candidateName + "\nVotes          : " + this.votes;
   }
}
