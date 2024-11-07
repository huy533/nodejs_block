import numpy as np
from collections import Counter
import matplotlib.pyplot as plt 

def euclidean_distance(x1,x2):
    return np.sqrt(sum((x1-x2) ** 2))

class KNN:
    def __init__(self, k= 3):
        self.k = k
    def fit(self , X , y):
        self.X_train = X
        self.y_train = y
    def predict(self, X):
        predicted_label = [self.__predict(x) for x in X]
        return np.array((predicted_label))

    def __predict(self , x):
        #compute distances
        distances = [euclidean_distance(x, x_train) for  x_train in self.X_train]
        #tra ve index mang ban dau sau khi duoc sap sep
        k_indices = np.argsort(distances)[0:self.k]
        #lay ra label cua nhung sample co khoang cach gan nhat den diem dang xet
        k_nearest_label = [self.y_train[i] for i in k_indices]
        #tra ve tupple co dang (label xuat hien nhieu nhat, so lan xuat hien)
        most_common = Counter(k_nearest_label).most_common(1)
        #tra ve label co so lan xuat hien nheiu nhat
        return most_common[0][0]
if __name__ == '__main__':
    # Tạo dữ liệu và nhãn
    np.random.seed(1)
    X = np.random.rand(15, 2) * 10
    print(X)
    y = np.array(
        ["tot", "xau", "xau", "tot", "tot", "xau", "tot", "tot", "tot", "xau",
         "tot", "xau", "xau", "xau", "tot"])
    # Tạo một thể hiện của lớp KNN
    knn = KNN(k=3)
    # Huấn luyện mô hình trên dữ liệu và nhãn đã tạo
    knn.fit(X, y)
    # Tạo một số điểm dữ liệu mới để dự đoán nhãn
    X_new = np.array([[5, 8]])
    # Dự đoán nhãn của các điểm dữ liệu mới
    y_pred = knn.predict(X_new)
    # In kết quả dự đoán
    print("Nhãn dự đoán của các điểm dữ liệu mới là:", y_pred)
    # Tìm 3 điểm gần nhất với X_new
    distances = [euclidean_distance(X_new[0], x_train) for x_train in X]
    k_indices = np.argsort(distances)[:3]
    k_nearest_points = [X[i] for i in k_indices]
    # Vẽ đường thẳng từ X_new đến các điểm gần nhất
    fig, ax = plt.subplots()
    colors = np.where(y == 'tot', 'r', 'k')
    ax.scatter(X[:, 0], X[:, 1], c=colors)
    ax.scatter(X_new[:, 0], X_new[:, 1], c='blue', marker='x')
    for point in k_nearest_points:
        ax.plot([X_new[0, 0], point[0]], [X_new[0, 1], point[1]], 'g--')
        print("3 diem gần nhất : ", point)
    radius = euclidean_distance(X_new[0], k_nearest_points[-1])
    print(radius)
    # Vẽ vùng bao quanh bằng hình tròn
    circle = plt.Circle(X_new[0], radius, color='g', fill=False)
    ax.add_artist(circle)
    plt.show()