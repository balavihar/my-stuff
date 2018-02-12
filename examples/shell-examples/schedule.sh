#!/bin/sh

echo "Enter VLA number to apply divert immediate and divert on no reply :"
read vla_number

echo "Enter number to divert immediate :"
read div_imm_number

echo "Enter number to divert on no reply:"
read div_noreply_number

echo "Entered VLA number : $vla_number"
echo "Entered VLA number : $div_imm_number"
echo "Entered VLA number : $div_noreply_number"

echo "Are all values correct :"
read -e confirm_val

if [ "$confirm_val" == "y" ] || [ "$confirm_val" == "Y" ]; then
echo "Is All values confirmed :$confirm_val"
else
echo "Is All values confirmed :$confirm_val"
fi