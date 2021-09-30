public class Fraction{

 private int numerateur;
 private int denominateur;


/**Constructeur**/
 public Fraction(){
  this.numerateur=0;
  this.denominateur=1;
 }
 public Fraction(int unNumerateur,int unDenominateur){
  this.numerateur=unNumerateur;
  this.denominateur=unDenominateur;
 }
 public Fraction(int unNumerateur){
  this.numerateur=unNumerateur;
  this.denominateur=1;
 }
/**Affichage**/
 public void affiche(){
  if(this.denominateur!=0){
   if(this.denominateur==1 || (this.numerateur%this.denominateur)==0){
    System.out.println(this.numerateur/this.denominateur);
   }
  }
  /*Est utilisé pour la method oppose*/
  else if(this.numerateur<0 && this.denominateur<0){
   reduire();
   this.numerateur=this.numerateur*(-1);
   this.denominateur=this.denominateur*(-1);
   System.out.println(this.numerateur+"/"+this.denominateur);
  }
  else if (this.denominateur==0)
   System.out.println("Pauvre naze tu essaies de diviser par zero... Tu aurais mieux fait de faire une Bac S.");
  else{
   reduire();
   System.out.println(this.numerateur+"/"+this.denominateur);
  }
 }

 /**Methode oppose**/
 public void oppose(){
  if(this.numerateur>0 && this.denominateur<0)
  {
    this.denominateur=this.denominateur*(-1);
  }
   else if(this.numerateur<0 && this.denominateur<0)
   {
    this.denominateur=this.denominateur*(-1);
   }
   else
    this.numerateur=this.numerateur*(-1);
 }
 /**Methode inverse**/
 public void inverse(){
   int a=this.numerateur;
   this.numerateur=this.denominateur;
   this.denominateur=a;
 }
 /**Methode difference**/
 public Fraction difference(Fraction uneFraction){
   int numF2= uneFraction.numerateur;
   int denF2= uneFraction.denominateur;
   int num=this.numerateur*denF2-numF2*this.denominateur;
   int den=this.denominateur*denF2;
   Fraction frac = new Fraction(num, den);
   return frac;
 }
 /**Methode somme**/
 public Fraction somme(Fraction uneFraction){
  int numF2= uneFraction.numerateur;
  int denF2= uneFraction.denominateur;
  int num=this.numerateur*denF2+numF2*this.denominateur;
  int den=this.denominateur*denF2;
  Fraction frac=new Fraction(num,den);
  return frac;
 }
 /**Methode produit**/
 public Fraction produit(Fraction uneFraction){
   int numF2= uneFraction.numerateur;
   int denF2= uneFraction.denominateur;
   int num=this.numerateur*numF2;
   int den=this.denominateur*denF2;
   Fraction frac = new Fraction(num, den);
   return frac;
 }
 /**Methode puissance**/
 public Fraction puissance(int exposant){
   int num=this.numerateur;
   int den=this.denominateur;
   if (exposant>0){
     if (exposant==1){
       Fraction frac = new Fraction(num, den);
       return frac;
     }
     else {
       for (int i=2;i<=exposant;i++){
         num=num*num;
         den=den*den;
       }
       Fraction frac = new Fraction(num, den);
       return frac;
     }
   }
   else {
     System.out.println ("Choisir une exposant positif, merci.");
     Fraction frac = new Fraction(num, den);
     return frac;
   }
 }
 /**Methode Quotient**/
 public Fraction quotient(Fraction uneFraction){
  if(this.denominateur!=0 && uneFraction.denominateur!=0 && uneFraction.numerateur!=0){
   int num=this.numerateur*uneFraction.denominateur;
   int den=this.denominateur*uneFraction.numerateur;
   Fraction frac=new Fraction(num,den);
   return frac;
  }
  else
   return uneFraction;
 }

/**operateur superieur**/
 public boolean superieur(Fraction uneFraction){
  double f01=this.numerateur/this.denominateur;
  double f02=uneFraction.numerateur/uneFraction.denominateur;
  if(f01>f02)
   return true;
  else
   return false;
 }
 /**operateur inferieur**/
 public boolean inferieur(Fraction uneFraction){
  double f01=this.numerateur/this.denominateur;
  double f02=uneFraction.numerateur/uneFraction.denominateur;
  if(f01<f02)
   return true;
  else
   return false;
 }
 /**operateur egal**/
 public boolean egal(Fraction uneFraction){
  double f01=this.numerateur/this.denominateur;
  double f02=uneFraction.numerateur/uneFraction.denominateur;
  if(f01==f02)
   return true;
  else
   return false;
 }
 /**Methode getPgcd**/
 private int getPgcd(){
  int a = this.numerateur;
  int b = this.denominateur;
  if ( a!=0 && b!=0){
   if ( a<0 ) a =-a;
   if ( b<0 ) b =-b;
   while ( a!=b ){
    if ( a<b )
     b =b - a;
    else
     a =a - b;
   }
   return a;
  }
  return -1;
 }
 /**Methode Reduire**/
 private void reduire(){
  int pgcd=getPgcd();
  this.numerateur=this.numerateur/pgcd;
  this.denominateur=this.denominateur/pgcd;
 }
}
