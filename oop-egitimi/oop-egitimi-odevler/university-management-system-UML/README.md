# Ödev
- Üniversiteye ait sınıflıklar, çalışma ofisleri ve departmanlar vardır.
- Departmanlara ait ofisler vardır.
- Üniversiteye ait çalışanlar vardır. Bu çalışanlar profesör veya memur olabilir.
- Her çalışan bir ofiste çalışır.
### Bu sistemi tasvir eden Class (Sınıf) diyagramını çiziniz.
`Not : Sınıflara ait nitelik ve davranışların belirtilmesine gerek yoktur.`

## **OUTPUT**
![output114](https://user-images.githubusercontent.com/74976052/134737284-c6a35a6f-19ce-4e50-b86b-18402ac54c07.png)

<br>

- Bir üniversitenin`(University)`, 1 veya daha fazla sınıflığı(`ClassRoom`) olmalı.
- Bir üniversitenin`(University)`, 1 veya daha fazla çalışanı`(Employee)` olmalı.
  - Çalışanlar, Profesör`(Professor)` veya Memur`(Officer)` olabilir.
- Bir üniversitenin`(University)`, 1 veya daha fazla ofisi`(Office)` olmalı.
  - Ofisler, çalışma ofisi`(WorkOffice)` veya departman ofisi`(DepartmentOffice)` olabilir.
  - Çalışanlar`(Employee)` sadece bir ofiste`(Office)` çalışabilir.
- Bir üniversitenin`(University)`, 1 veya daha fazla departmanı`(Department)` olmalı.