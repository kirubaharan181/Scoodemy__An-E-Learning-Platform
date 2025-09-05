# Learning Platform — Java Swing + MySQL

A **Java Swing desktop application** with **MySQL backend** to manage a learning platform.  
It supports multiple roles — **Admin, Teacher, Student, and Parent** — with features like login, course enrollment, quizzes, class management, and progress tracking.  
The project is built in **NetBeans** using the Swing GUI builder (`.form` + `.java` files).

---

## ✨ Features (Modules)

- **Authentication & Roles**
  - `admin_login.java`, `teacher_login.java`, `student_login.java`, `parent_login.java`
  - Login system for different roles.

- **Admin**
  - `admin_mgmt.java`, `Add_teacher.java`
  - Admin can manage teachers and oversee the system.

- **Teacher**
  - `teach_display.java`, `create_quiz.java`, `classroom.java`
  - Teachers can create classes, manage quizzes, and monitor students.

- **Student**
  - `stud_signUp.java`, `student_login.java`, `stud_display.java`, `enroll_course.java`
  - Students can sign up, log in, enroll in courses, and view details.

- **Parent**
  - `Parent_display.java`, `par_log.java`
  - Parents can log in to check student progress.

- **Quizzes**
  - `create_quiz.java`, `quiz.java`
  - Teachers can create quizzes; students can attempt them.

- **Utilities**
  - `login_entry.java` → common login entry point.  
  - `Connect/DriverManager.java` → database connection.  
  - `images/`, `stud.jpeg` → resources for UI.  

---

## 📂 Project Structure

```text
learning_platform/src/main/java/
├─ com/                         # (package files if used)
├─ DriverManager/                # DB driver classes
├─ images/                       # UI resources (e.g., stud.jpeg)
├─ Project/                      # project-specific files
├─ src/                          # (NetBeans build src)
├─ target/                       # (build output)
├─ Add_teacher.java              # Add teacher (Admin module)
├─ admin_login.java              # Admin login
├─ admin_mgmt.java               # Admin dashboard/management
├─ classroom.java                # Classroom creation/management
├─ create_quiz.java              # Quiz creation (Teacher module)
├─ DriverManager.java            # Database connection helper
├─ enroll_course.java            # Student course enrollment
├─ four.java                     # (utility/test file)
├─ login_entry.java              # Common login entry point
├─ Parent_display.java           # Parent dashboard
├─ parent_login.java             # Parent login screen
├─ par_log.java                  # Parent login (alt)
├─ quiz.java                     # Quiz attempt/play
├─ stud_display.java             # Student dashboard
├─ student_login.java            # Student login
├─ stud_signUp.java              # Student sign-up
├─ teacher_login.java            # Teacher login
└─ teach_display.java            # Teacher dashboard

⚙️ Setup Instructions

Install JDK 8+ and MySQL.

Create a MySQL database (e.g., learning_db) and tables for:

Users (with roles: admin, teacher, student, parent)

Courses

Enrollments

Quizzes and Results

Open the project in NetBeans.

Update database credentials in DriverManager.java (or equivalent).

Set login_entry.java as the main class to run the system.

▶️ User Flows

Admin: login → add teachers → manage platform.

Teacher: login → create classes/quizzes → view enrolled students.

Student: sign up/login → enroll in courses → attend quizzes → view results.

Parent: login → check child’s progress and performance.

🚀 Future Improvements

Online quiz submissions with grading.

Notifications for parents and students.

File sharing (assignments/resources).

Role-based dashboards with analytics.
