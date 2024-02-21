# TP N°1 : Inversion de contrôle et Injection des dépendances

## Partie 1


L'objectif de cette pratique est de maîtriser le développement d'applications en prenant en considération l'aspect de mise à niveau et d'amélioration continue, en utilisant les principes d'inversion de contrôle et d'injection de dépendances. Nous commencerons par explorer les différentes formes d'injection disponibles, puis nous progresserons vers la création de notre propre cadre (framework) afin d'atteindre cet objectif.
1. **Création de l'interface IDao avec une méthode getDate :** <br>
  ![Capture d’écran 2024-02-20 235205](https://github.com/otari2002/JEE_AP1/assets/53525728/1eec4ee9-9637-4a6b-a520-84c2c862825c)<br>

2. **Création d'une implémentation de cette interface :**<br>
J'ai créé deux implémentations afin d'avoir suffisamment d'implémentations à tester 
pour l'injection des dépendances
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/83ee09ca-187f-4e5a-b1be-28cc2e025f13)

<br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/f9ad005d-5428-4064-b2c8-acb96dab0cd5)


4. **Création l'interface IMetier avec une méthode calcul :**<br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/3fbc7d01-b5ef-48cf-b86e-34ed11cfb17a)
<br>

5. **Création d'une implémentation de cette interface en utilisant le couplage faible :**<br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/31aae147-e928-4305-a119-cfda1103a396)
<br>

6. **Injection des dépendances :**
   - Par instanciation `statique` :<br>
   ![image](https://github.com/osmel1/tp1_JEE/assets/110778429/86802617-c8c8-4da0-ac65-4683dade99bb)
<br>


   - Par instanciation `dynamique` :<br>
   Je vais créer un fichier <strong>config.txt</strong> qui contient le path des classes : <br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/2dde1883-f41a-4ead-b32e-1037705239d9)
<br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/1579b884-1d9c-4680-a480-9247ef322d54)
<br>

  - En utilisant le Framework Spring :<br>
   => Version XML : 
  Pour cette version je vais créer un fichier appContext.xml de configuration : <br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/47d8341b-b222-418b-9775-6536d5219fde)
<br>
Puis une classe de présentation : <br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/0fbbd5e8-aba7-4c95-b791-e27dd74d1294)
<br>
  => Version Annotation : 
  Pour cette version, il faut ajouter l’annotation `@Component` aux implementations des interfaces <br>
 ![image](https://github.com/osmel1/tp1_JEE/assets/110778429/ed043864-b7c9-4187-86f2-d0ac0702b3f7)
 <br>
  ![image](https://github.com/osmel1/tp1_JEE/assets/110778429/3cc04751-3ba0-4ca3-9550-c9fde41efcad)
<br>
  Voici la classe de présentation :<br>
![image](https://github.com/osmel1/tp1_JEE/assets/110778429/3c7689a4-d4bb-4516-ac4d-879de266ba03)

## Conclusion

Cette expérience m'a permis de saisir l'importance de recourir à l'injection de dépendances dans le processus de développement, ainsi que les diverses méthodes pour y parvenir, notamment les approches statique et dynamique, la plus efficace étant l'utilisation d'un framework.
  





