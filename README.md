# Assignment 01 - Session 03 - Conditional

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Status](https://img.shields.io/badge/status-completed-brightgreen)

<!-- TOC -->
* [Assignment 01 - Session 03 - Conditional](#assignment-01---session-03---conditional)
  * [Prerequisites](#prerequisites)
    * [Project Structure](#project-structure)
    * [Environment](#environment)
  * [Questions](#questions)
    * [Câu 1](#câu-1)
    * [Câu 2](#câu-2)
    * [Câu 3](#câu-3)
    * [Câu 4](#câu-4)
    * [Câu 5](#câu-5)
  * [Author](#author)
<!-- TOC -->

## Prerequisites

### Project Structure

```text
./
│   .gitignore
│   README.md
└───src
        MainApplication.java
```

### Environment

- IDE: IntelliJ IDEA
- JDK: 21 or higher

## Questions

### Câu 1

- **Đề bài**:
    - Viết chương trình nhập vào 2 số nguyên m, n.
    - Xác định và xuất số nguyên lớn nhất.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập lần lượt 2 số nguyên n, m
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 
           
           STEP1["Lấy giá trị người dùng gán cho biến m, và n"]
           STEP2[So sánh m và n và gán giá trị lớn nhất cho biến max]
           STEP3["Chuỗi thông báo 2 số: n, m và số lớn nhất"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo và xác định số nguyên lớn nhất
       `"]
   ```

- **Ví dụ**:

  | m | n | Kết quả          |
  |---|---|------------------|
  | 5 | 8 | `Số lớn nhất: 8` |

### Câu 2

- **Đề bài**:
    - Cho người dùng nhập vào 3 số nguyên
    - Viết chương trình xuất 3 số theo thứ tự tăng dần.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập lần lượt 3 số nguyên a, b, c
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 
           
           STEP1["Lấy giá trị người dùng gán lần lượt cho first, seconde và third"]
           STEP2[So sánh first, seconde và third để tìm ra thứ tự tăng dần]
           STEP3["Chuỗi thông báo chuỗi số đã sắp xếp theo thứ tự tăng dần"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo và chuỗi số theo thứ tự tăng dần
       `"]
   ```

- **Ví dụ**:

  | first | second | third | Kết quả                    |
  |-------|--------|-------|----------------------------|
  | 7     | 2      | 9     | `Thứ tự tăng dần: 2, 7, 9` |

### Câu 3

- **Đề bài**:
    - Tương tự câu 2, nhưng cho phép Hỏi người dùng muốn xuất theo thứ tự
    - Với 1: xuất Tăng dần; 2: xuất giảm dần.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập lần lượt 3 số nguyên a, b, c và thứ tự sắp xếp (1- Tăng dần; 2- Giảm dần)
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 
           
           STEP1["Lấy giá trị người dùng gán lần lượt cho first, second và third và type"]
           STEP2[So sánh first, seconde và third và dựa vào type để tìm ra thứ tự tăng/giảm]
           STEP3["Chuỗi thông báo chuỗi số đã sắp xếp theo thứ tự"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo và chuỗi số theo thứ tự
       `"]
   ```

- **Ví dụ**:
  
  | first | second | third | type | Kết quả                    |
  |-------|--------|-------|------|----------------------------|
  | 7     | 2      | 9     | 1    | `Thứ tự tăng dần: 2, 7, 9` |
  | 7     | 2      | 9     | 2    | `Thứ tự tăng dần: 9, 7, 2` |

### Câu 4

- **Đề bài**:
    - Viết chương trình cho phép nhập vào số nguyên có hai chữ số
    - Hãy in ra cách đọc của số nguyên này.

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập vào số nguyên có 2 chữ số
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3 --> STEP4
           
           STEP1["Lấy giá trị người dùng gán vào cho biến number"]
           STEP2["Kiểm tra number có thỏa điều kiện là số nguyên, có 2 chữ số"]
           STEP3["Tìm số hàng chục (chia lấy phần nguyên) và số hàng đơn vị (chia lấy phần dư)"]
           STEP4["In ra cách đọc số nguyên 2 chữ số"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo
       `"]
   ```

- **Ví dụ**:

  | number | Kết quả                      |
  |--------|------------------------------|
  | 21     | `Số 21 đọc là: hai mươi mốt` |
  | 15     | `Số 15 đọc là: mười lăm`     |

### Câu 5

- **Đề bài**:
    - Hãy viết chương trình “Chào Hỏi" các thành viên của gia đình có đặc điểm sau đây:
        - Đầu tiên máy sẽ hỏi ai đang sử dụng máy
        - Sau đó căn cứ vào câu trả lời nhận được mà máy cần đưa ra một câu chào hợp lý, dễ thương
    - Giả sử, trong gia đình có 4 thành viên là : Bố (B), Mẹ (H), anh trai (A) và em gái (E)

- **Mô hình 3 khối**:

   ```mermaid
   flowchart LR
       INPUT --> PROCESS --> OUTPUT
       
       INPUT["`**Input**
           Nhập vào người đang sử dụng: Bố (B), Mẹ (H), anh trai (A) và em gái (E)
       `"]
       
       subgraph PROCESS["`**Process**`"]
           STEP1  --> STEP2 --> STEP3
           
           STEP1["Lấy giá trị người dùng gán vào cho biến role"]
           STEP2["Kiểm tra role có thỏa điều kiện: là các chữ cái: B, H, A và E"]
           STEP3["In ra câu chào dựa vào vai trò (role)"]
       end
       
       OUTPUT["`**Output**
           In ra thông báo
       `"]
   ```

- **Ví dụ**:

  | role | Kết quả                          |
  |------|----------------------------------|
  | B    | `Chào ông! Máy tính đã sẵn sàng` |


## Author

Khang Nguyen
