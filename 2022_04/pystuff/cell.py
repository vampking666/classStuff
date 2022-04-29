from tkinter import *
import random
import settings

class Cell:
    
    all = []
    
    def __init__(self, x, y, is_mine=False):
        self.is_mine = is_mine
        self.cell_btn_object = None
        self.x = x
        self.y = y
        
        #append the object to the Cell.all list
        Cell.all.append(self)
    def create_btn_object(self, location):
        btn = Button(
            location,
            width=12, 
            height=4,
            text=f"{self.x}.{self.y}"
        )
        
        self.cell_btn_object = btn
        btn.bind('<Button-1>', self.left_click_actions) #left click
        btn.bind('<Button-3>', self.right_click_actions) #right click
        
    def left_click_actions(self, event):
        if self.is_mine:
            self.show_mines()
        else:
            self.show_cell()
            
    def get_cell_by_axis(self, x, y):
        for cell in Cell.all:
            if cell.x == x and cell.y:
                return cell
    
    def show_cell(self):
        surrounded_cells = [
            self.get_cell_by_axis(self.x - 1, self.y - 1),
            self.get_cell_by_axis(self.x - 1, self.y),
            
        ]
    
    def show_mines(self):
        #logic to interrupt the gane and display a message that the player lost
        self.cell_btn_object.configure(bg='red')     
    
    def right_click_actions(self, event):
        print(event)
        print("I am right-clicked!")

    @staticmethod
    def randomize_mines():
        picked_cells = random.sample(
            Cell.all, settings.MINES_COUNT
        )
        for picked_cells in picked_cells:
            picked_cells.is_mine = True
    
    
    def __repr__(self):
        return f"Cell({self.x}, {self.y})"