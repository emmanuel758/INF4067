# INF4067

Ce dépôt est dédié à la compréhension et la réalisation des exercies sur l'unité d'enseignement INF 4067 intitulé UML et les Desgins Patterns

### STRUCTURE

Chaque dossier (devoir_*) est rattaché a un patron de conception et sa structure est la suivante:

  ```
  devoir_*
  |---LEUNA_FIENKAK_NKEHEUP_20U2698 
  |   |---Code  
  |   |   |---exemple  
  |   |   |   |---Client.java  
  |   |   |   |---class2.java  
  |   |   |   |---....  
  |   |   |   |---classn.java  
  |   |   |---exempleModifier  
  |   |   |   |---Client.java  
  |   |   |   |---class2.java  
  |   |   |   |---....  
  |   |   |   |---classn.java  
  |   |---Modèle.pdf  
  |---LEUNA_FIENKAK_NKEHEUP_20U2698.ZIP  
  Lien GitHub.txt  
  modele.dia
  modele.odt
 ```
Les fichiers modele.dia et modele.odt sont des fichiers templates (utilisées lors du traitement d'un exercice). Lorsque un modèle doit être déssiner
celui - ci est fait dans modele.dia puis est exporté sous forme d'image et importé dans modele.odt. Lorsque la saisie est terminée dans modele.odt pour un exercice donné,
le contenu de modele.odt est exporté sous dorme pdf (Modèle.pdf) et stocké dans le dossier LEUNA_FIENKAK_NKEHEUP_20U2698

- Dans le dossier exemple se trouve l'exemple du support de cours et dans exempleModifier, une copie modifiée de l'exemple du cours

- Dans chaque dossier devoir_* se trouve une archive LEUNA_FIENKAK_NKEHEUP.zip qui est tout simplement le contenu archiver du dossier LEUNA_FIENKAK_NKEHEUP_20U2698

- Dans chaque dossier de code (exemple, exempleModifier) se trouve un fichier client.java qui est le fichier de test

### REFÉRENCES

devoir_1  : **Le Patron Factory**  
devoir_2  : **Le Patron Abstract Factory**  
devoir_3  : **Le patron Singleton**  
devoir_4  : **Le Patron Builder**  
devoir_5  : **Le Patron Prototype**

### EXECUTION

Après avoir télécharger et decompresser l'archive LEUNA FIENKAK NKEHEUP.zip, se placer dans l'un des dossier exemple ou exempleModifier
ouvrir l'emplacement dans un terminal et entrer la commande
 ```
javac *.java
 ```
pour compiler tous les fichier .java du dossier
puis exécuter en appelant la classe de test (client) avec la commande 
```
java Client
 ```

### NOTE

Il est à noter que ce fichier **README.md** sera amené à evoluer lorsque de nouveau exercices seront donnés en cours.
